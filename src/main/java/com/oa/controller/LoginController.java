package com.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiongshengjie on 2017/5/31.
 */

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String hello() {
        return "login";
    }
}
