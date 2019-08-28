package com.js.ctc.qualify.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author NingKang
 * @Date 2019/8/27 8:56
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
          return "login/login";
    }

    @RequestMapping("/login-error")
    public String loginError(){
        return "login/login-error";
    }

}
