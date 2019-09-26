package com.acan.service;

import com.acan.entity.Student;
import com.acan.service.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignService {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/port")
    public String port();
}
