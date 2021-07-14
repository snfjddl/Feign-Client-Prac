package com.feignclient.test2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FService2 {
    @Autowired
    FC2 fc;

    public Member test() {
        return fc.test2();
    }
}
