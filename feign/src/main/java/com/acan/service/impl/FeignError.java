package com.acan.service.impl;

import com.acan.entity.Student;
import com.acan.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignService {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String port() {
        return "服务器维护中";
    }
}
