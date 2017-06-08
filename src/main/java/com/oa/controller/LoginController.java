package com.oa.controller;

import com.oa.mapper.TeacherMapper;
import com.oa.service.LoginService;
import com.oa.util.MyUserToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by xiongshengjie on 2017/5/31.
 */

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String hello() {
        return "loginView";
    }

    @RequestMapping("/doLogin")
    public String isLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
//                          @RequestParam("rememberMe") boolean rememberMe,
                          @RequestParam("userType") String userType,
                          HttpSession session) {
        Subject user = SecurityUtils.getSubject();
        boolean rememberMe = true;
        MyUserToken token =
                new MyUserToken(username, password, rememberMe, userType);
        try {
            user.login(token);
            if (userType.equalsIgnoreCase("teacher"))
                session.setAttribute("user", loginService.getTeacherByUsername(username));
            else if (userType.equalsIgnoreCase("admin"))
                session.setAttribute("user", loginService.getAdminByUsername(username));
            else if (userType.equalsIgnoreCase("leader"))
                session.setAttribute("user", loginService.getLeaderByUsername(username));
            else session.setAttribute("user", loginService.getStudentByUsername(username));
            return "redirect:/";
        } catch (Exception uae) {
            throw new RuntimeException(uae);
        }
    }

    @RequestMapping("/")
    public String home(Model model, HttpSession session) {
        model.addAttribute("user", session.getAttribute("user"));
        return "admin/home";
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
