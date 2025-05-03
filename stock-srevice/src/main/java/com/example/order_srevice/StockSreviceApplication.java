package com.example.order_srevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockSreviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockSreviceApplication.class, args);
	}

}
