package com.ruisdata.feign.controller;

import com.ruisdata.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 17:16
 * @Version 1.0
 **/
@RestController
@RequestMapping("/feign")
public class TestController {
    //编译会报错，因为bean是在运行的时候注入的，编译器识别不出来所以报错
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
        public String test(){
        final String test = testService.test();
        return test;
    }
}
