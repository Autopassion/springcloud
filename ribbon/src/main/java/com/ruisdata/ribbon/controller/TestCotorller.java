package com.ruisdata.ribbon.controller;

import com.ruisdata.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 16:05
 * @Version 1.0
 **/
@RestController
@RequestMapping("/ribbon")
public class TestCotorller {
    @Autowired
    private TestService testService;
    @RequestMapping("/consume")
    public String test() {
        final String result = testService.consumeTest();
        return result;
    }
}
