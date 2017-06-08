package com.oa.controller;

import com.oa.mapper.TeacherMapper;
import com.oa.util.MyUserToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

/**
 * Created by xiongshengjie on 2017/5/31.
 */

@Controller
public class LoginController {
    @Autowired
    TeacherMapper mapper;

    @RequestMapping("/login")
    public String hello() {
        return "login";
    }

    @RequestMapping("/doLogin")
    public String isLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
//                          @RequestParam("rememberMe") boolean rememberMe,
                          @RequestParam("userType") String userType) {
        Subject user = SecurityUtils.getSubject();
        boolean rememberMe = true;
        MyUserToken token =
                new MyUserToken(username, password, rememberMe, userType);
        try {
            user.login(token);
            return "admin/home";
        } catch (Exception uae) {
            throw new RuntimeException(uae);
        }
    }


//    @RequestMapping("/login")
//    public String login() {
//        return "/login";
//    }
//
    @RequestMapping("/home_except_top")
    public String home() {
        return "admin/home_except_top";
    }
//
    @RequestMapping("/menu")
    public String menu() {
        return "admin/menu";
    }
//
    @RequestMapping("/teach")
    public String teach() {
        return "admin/teach";
    }
//
    @RequestMapping("/list")
    public String top() {
        return "leave/list";
    }
}
