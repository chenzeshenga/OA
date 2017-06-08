package com.oa.controller;

import com.oa.entity.Reimbursement;
import com.oa.service.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by somed on 2017/6/8.
 */
@Controller
public class ReimbursementController {
    @Autowired
    ReimbursementService reimbursementService ;

    @RequestMapping("/listre")
    public ModelAndView listReimbursement() {
        ModelAndView mav = new ModelAndView();

        List<Reimbursement> list = reimbursementService.listPositiveReimbursement();
        mav.addObject("list", list);
        mav.setViewName("reimbursement/list");
        return mav;
    }

    @RequestMapping("/editre")
    public String editLeave() {
        return "reimbursement/edit";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/doD_Edit")
    public String askLeave(@RequestParam("type") String type,
                           @RequestParam("money") int money,
                           @RequestParam("id") int id) {
        reimbursementService.askForReimbursement(id,money,type);
        return "redirect:/list/re";
    }
}
