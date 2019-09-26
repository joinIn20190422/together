package com.acan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String goRegister(){
        System.out.println("xxx");
        return "/register";
    }
}
