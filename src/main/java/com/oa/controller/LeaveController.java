package com.oa.controller;

import com.oa.entity.Leave;
import com.oa.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
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
    public ModelAndView listLeaves() {
        ModelAndView mav = new ModelAndView();

        List<Leave> list = leaveService.listPositiveLeaves();
        mav.addObject("list", list);
        mav.setViewName("leave/list");
        return mav;
    }

    @RequestMapping("/edit")
    public String editLeave() {
        return "leave/edit";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/doEdit")
    public String askLeave(@RequestParam("ApplicantStartTime") Date startTime,
                           @RequestParam("ApplicantEndTime") Date endTime,
                           @RequestParam("id") int id,
                           @RequestParam("reason") String reason) {
        leaveService.askForLeave(id, reason, startTime, endTime);
        return "redirect:/list";
    }
}
