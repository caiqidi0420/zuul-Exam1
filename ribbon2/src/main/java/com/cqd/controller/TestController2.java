package com.cqd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
    @RequestMapping("test01")
    public String test01(String name){
        System.out.println("---name--"+name);
        return "test01 ^_^"+name;

    }
}
