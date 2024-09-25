package com.First.simpleWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    //@ResponseBody
    public String greet(){
        System.out.println("I am here");
        return "Welcome";
    }
    @RequestMapping("/about")
    public String about(){
        return "We dont teach ,We Educate!...";
    }
}
