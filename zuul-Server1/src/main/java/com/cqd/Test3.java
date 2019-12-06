package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class Test3 {
    public static void main(String[] args) {
        SpringApplication.run(Test3.class);
    }



    @RequestMapping("testPath")
    public String testPath(){
        System.out.println("test3健康");
        return "test3健康";
    }

}
