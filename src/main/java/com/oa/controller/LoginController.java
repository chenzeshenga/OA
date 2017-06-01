package com.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiongshengjie on 2017/5/31.
 */

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

    @RequestMapping("/home")
    public String home() {
        return "admin/home";
    }

    @RequestMapping("/menu")
    public String menu() {
        return "admin/menu";
    }

    @RequestMapping("/teach")
    public String teach() {
        return "admin/teach";
    }
}
