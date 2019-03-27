package com.ruisdata.eurekaclient1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 15:53
 * @Version 1.0
 **/
@RestController
@RequestMapping("/eureka")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "eureka client1";
    }
}
