package com.ruisdata.feign.service;

import com.ruisdata.feign.hystrixerror.HystrixError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 17:13
 * @Version 1.0
 **/
@FeignClient(value="eureka-client1",fallback = HystrixError.class)
public interface TestService {
    @RequestMapping("/eureka/test")
    String test();
}
