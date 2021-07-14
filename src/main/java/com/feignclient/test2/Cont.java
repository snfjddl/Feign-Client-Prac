package com.feignclient.test2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cont {

    @GetMapping("/testfeign2")
    public Member newm() {
        return new Member(1L, "Kim");
    }
}
