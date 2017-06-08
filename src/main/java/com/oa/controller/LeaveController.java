package com.oa.controller;

import com.oa.entity.*;
import com.oa.service.LeaveService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by bran on 2017/6/8.
 */
@Controller
public class LeaveController {
    @Autowired
    LeaveService leaveService;

    @RequestMapping("/list")
    public ModelAndView listLeaves(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Object user = session.getAttribute("user");
        int id = getId(user);
        List<Leave> list;
        if (id > 1000 && id < 2000) {
            list = leaveService.listPositiveLeaves();
            List<LeaveBean> names = new ArrayList<>();
            for (Leave leave : list) {
                LeaveBean bean = new LeaveBean();
                bean.setLeave(leave);
                bean.setName(leaveService.getNameFromApplicantId(leave.getApplicantid()));
                names.add(bean);
                mav.addObject("list", names);
            }

        } else {
            list = leaveService.listLeavesOfAPerson(id);
            mav.addObject("list", list);
        }
        mav.setViewName("leave/list");
        return mav;
    }

    @RequestMapping("/edit")
    public String editLeave() {
        return "leave/edit";
    }

    @RequestMapping(value = "/doEdit", method = RequestMethod.GET)
    public String check(@RequestParam("oid") String oid,
                        @RequestParam("status") int status) {
        Leave leave = new Leave();
        leave.setId(Byte.valueOf(oid));
        if (status == 0)
            leave.setApplicationstatus("NO");
        else leave.setApplicationstatus("YES");
        leave.setApprovetime(new Date());
        leaveService.updateVerifyOpinion(leave);
        return "redirect:/list";
    }


    @RequestMapping(value = "/doEdit", method = RequestMethod.POST)
    public String askLeave(@RequestParam("ApplicantStartTime") String startTime,
                           @RequestParam("ApplicantEndTime") String endTime,
                           @RequestParam("id") int id,
                           @RequestParam("reason") String reason) {
        try {
            int userType = getUserType();
            leaveService.askForLeave(id + userType, reason, startTime, endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "redirect:/list";
    }

    private int getUserType() {
        int userType = 0;
        Subject subject = SecurityUtils.getSubject();
        if (subject.hasRole("leader"))
            userType += 1000;
        if (subject.hasRole("student"))
            userType += 2000;
        return userType;
    }

    private int getId(Object o) {
        int userType = getUserType();
        if (userType < 1000)
            return userType + ((Teacher) o).getId();
        if (userType < 2000)
            return userType + ((Leader) o).getId();
        return userType + ((Student) o).getId();
    }
}
