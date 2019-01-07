package com.zach.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author Zhangsz
 * @Description TODO
 * @Date 2019/1/2 10:07
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry "+name;
    }
}
