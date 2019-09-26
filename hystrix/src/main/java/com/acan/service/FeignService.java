package com.acan.service;

import com.acan.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
@Component
public interface FeignService {

    @GetMapping("/student/findAll")
    public Collection<Student> finAll();

    @GetMapping("/student/port")
    public String port();
}
