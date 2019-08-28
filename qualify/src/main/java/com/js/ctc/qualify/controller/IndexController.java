package com.js.ctc.qualify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author NingKang
 * @Date 2019/8/28 17:13
 * @Version 1.0
 **/
@Controller
public class IndexController {


    @RequestMapping("/index")
    public  String  index(){
        return "index";
    }
}
