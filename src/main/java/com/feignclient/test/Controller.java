package com.feignclient.test;

import com.feignclient.test2.FService2;
import com.feignclient.test2.Member;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients(basePackages = "com.feignclient.test2")
@RestController
public class Controller {

    private final FService2 fc;

    public Controller(FService2 fc) {
        this.fc = fc;
    }

    @GetMapping("/test1")
    public Member testt1() {
        Member mem = fc.test();

        mem.setName("KOREA!!");

        return mem;
    }

}
