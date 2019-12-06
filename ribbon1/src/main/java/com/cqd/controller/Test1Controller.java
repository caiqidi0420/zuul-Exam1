package com.cqd.controller;

import com.cqd.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {
    @Autowired
    private TestApi testApi;

    @RequestMapping("test01/{name}")
    public String test001(@PathVariable String name){
        String s = testApi.test01(name);
        return s;
    }
}
