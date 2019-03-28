package com.ruisdata.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 16:07
 * @Version 1.0
 **/
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(defaultFallback = "hystrixFallback")
    public String consumeTest(){
        return restTemplate.getForObject("http://eureka-client1/eureka/test",String.class);
    }
    
    public String hystrixFallback(){
        return "server error";
    }
}
