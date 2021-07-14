package com.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients ; @FeignClient가 달려있는 interface를 찾아서 등록해줌.
 * 호출하려는 class가 하위 패키지에 없다면 basepackes를 따로 지정해줄 수 있음
 */
@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
