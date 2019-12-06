package com.cqd.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//通过geign调用
@FeignClient(name = "ribbon2")
public interface TestApi {
    @RequestMapping("test01")
    public String test01(@RequestParam("name") String name);
}
