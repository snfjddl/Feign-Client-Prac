package com.feignclient.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "test", url = "http://localhost:8080")
public interface FC {

    @GetMapping("/testfeign")
    String test();
}
