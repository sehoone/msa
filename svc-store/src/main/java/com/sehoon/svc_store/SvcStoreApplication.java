package com.sehoon.svc_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // 유레카 클라이언트로 등록
@SpringBootApplication
public class SvcStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcStoreApplication.class, args);
	}

}
