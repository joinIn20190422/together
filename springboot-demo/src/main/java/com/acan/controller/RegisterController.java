package com.acan.controller;

import com.acan.entity.User;
import com.acan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String goRegister(){
        return "/register";
    }

    @RequestMapping("/checkUsername")
    @ResponseBody
    public Map<String,Object> checkUsername(String username){
        Map<String,Object> map = new HashMap<>();
        User user = userService.selUserByName(username);
        System.out.println(user);
        if(user != null){
            map.put("flag",true);
            return map;
        }
        map.put("flag",false);
        return map;
    }
}
