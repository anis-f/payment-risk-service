package com.stuff.paymentriskservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentRiskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentRiskServiceApplication.class, args);
	}

}
