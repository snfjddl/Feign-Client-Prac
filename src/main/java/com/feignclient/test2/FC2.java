package com.feignclient.test2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test2", url = "http://localhost:8080")
public interface FC2 {

    @GetMapping("/testfeign2")
    Member test2();
}
