package com.zach.servicefeign.controller;

import com.zach.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zhangsz
 * @Description TODO
 * @Date 2018/12/29 10:18
 */
@RestController
public class HelloController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value="/hello")
    public String sayHello(@RequestParam String name) {
        return schedualServiceHi.sayHelloFromClientOne(name);
    }
}
