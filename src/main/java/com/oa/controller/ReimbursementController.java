package com.oa.controller;

import com.oa.entity.*;
import com.oa.service.ReimbursementService;

import org.apache.shiro.SecurityUtils;
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
import java.util.Objects;

/**
 * Created by somed on 2017/6/8.
 */
@Controller
public class ReimbursementController {
    @Autowired
    ReimbursementService reimbursementService ;

    @RequestMapping("/listre")
    public ModelAndView listReimbursement(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Object user = session.getAttribute("user");
        int id = getId(user);
        List<Reimbursement> list;
        if (id > 1000 && id < 2000){
            list = reimbursementService.listPositiveReimbursement();
            List<ReimbursementBean> names = new ArrayList<>();
            for(Reimbursement reimbursement : list){
                ReimbursementBean bean = new ReimbursementBean();
                bean.setReimbursement(reimbursement);
                bean.setName(reimbursementService.getNameFromApplicantId(reimbursement.getApplicantid()));
                names.add(bean);
                mav.addObject("list", names);
            }
        }
        else{
            list = reimbursementService.listRemibursementofAperson(id);
            mav.addObject("list", list);
        }
        mav.setViewName("reimbursement/list");
        return mav;
    }

    @RequestMapping("/editre")
    public String editLeave() {
        return "reimbursement/edit";
    }

    @RequestMapping(value = "/doD_Edit", method = RequestMethod.GET)
    public String check(@RequestParam("oid") String oid,
                        @RequestParam("status") int status) {
        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setId(Byte.valueOf(oid));
        if (status == 0)
            reimbursement.setReimbursementstatus("NO");
        else reimbursement.setReimbursementstatus("YES");
        reimbursement.setApprovetime(new Date());
        reimbursementService.updateVerifyOpinion(reimbursement);
        return "redirect:/listre";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/doD_Edit")
    public String askLeave(@RequestParam("type") String type,
                           @RequestParam("money") int money,
                           @RequestParam("id") int id) {
        try {
            int userType = getUserType();
            reimbursementService.askForReimbursement(id,money,type);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return "redirect:/listre";
    }

    private int getId(Object o) {
        int userType = getUserType();
        if (userType < 1000)
            return userType + ((Teacher) o).getId();
        if (userType < 2000)
            return userType + ((Leader) o).getId();
        return userType + ((Student) o).getId();
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
}
