package com.oa.controller;

import com.oa.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiongshengjie on 2017/5/31.
 */

@Controller
public class LoginController {
    @Autowired
    TeacherMapper mapper;

    @RequestMapping("/login")
    public String hello(Model model) {
        model.addAttribute("teacher", mapper.selectByPrimaryKey(1));
        return "loginView";
    }


//    @RequestMapping("/login")
//    public String login() {
//        return "/login";
//    }
//
//    @RequestMapping("/home_except_top")
//    public String home() {
//        return "admin/home_except_top";
//    }
//
//    @RequestMapping("/menu")
//    public String menu() {
//        return "admin/menu";
//    }
//
//    @RequestMapping("/teach")
//    public String teach() {
//        return "admin/teach";
//    }
//
//    @RequestMapping("/home")
//    public String top() {
//        return "admin/home";
//    }
}
