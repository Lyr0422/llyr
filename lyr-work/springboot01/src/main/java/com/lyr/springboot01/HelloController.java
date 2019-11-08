package com.lyr.springboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("new", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
    @RequestMapping("/goodbay")
    public String goodbay(){
        return "Goodbay Spring Boot!";
    }
}
