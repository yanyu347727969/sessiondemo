package com.york.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import static java.lang.System.in;

/**
 * Created by np0323 on 2017/7/26.
 */
@Controller
public class LoginAction {
    @RequestMapping(value="/login")
    public String login(HttpSession session, String username, String password){
        if ("york".equals(username)||"930304".equals(password)) {
            session.setAttribute("username ","york");
            System.out.println(username +" 登录成功");
            return "success";
        }
        return "fail";
    }
    @RequestMapping(value="/loginBefore")
    public String loginBefore(String username,String password){
        System.out.println("1111");
        return "login";
    }

}

