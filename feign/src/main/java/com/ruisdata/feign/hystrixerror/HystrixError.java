package com.ruisdata.feign.hystrixerror;

import com.ruisdata.feign.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @ClassName HystrixError
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/3/27 17:39
 * @Version 1.0
 **/
@Component
public class HystrixError implements TestService {
    
    @Override
    public String test() {
        return "server error";
    }
}
