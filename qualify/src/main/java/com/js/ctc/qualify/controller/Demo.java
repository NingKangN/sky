package com.js.ctc.qualify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author NingKang
 * @Date 2019/8/26 14:49
 * @Version 1.0
 **/
@Controller
@RequestMapping("/Demo")
public class Demo {

    @RequestMapping("/index")
    public  String index(){
        return "index";
    }
}
