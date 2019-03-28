package com.ruisdata.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 15:30
 * @Version 1.0
 **/
@RestController
@RefreshScope
@RequestMapping("/eureka")
public class TestController {
    @Value("${value}")
    String value;
    
    @RequestMapping("/test")
    public String test(){
        return "eureka clinet "+value;
    }
    
}
