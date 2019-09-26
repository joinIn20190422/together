package com.acan.controller;

import com.acan.entity.Student;
import com.acan.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignService.findAll();
    }

    @GetMapping("/port")
    public String port(){
        return feignService.port();
    }
}
