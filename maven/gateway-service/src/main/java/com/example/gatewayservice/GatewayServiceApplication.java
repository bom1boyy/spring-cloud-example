package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Cloud Gateway 클래스 선언
 *  < 수행역할 >
 * 	 1. 수행중인 서비스들을 Eureka 서버로부터 위치를 물어본다.
 * 	 2. Eureka 서버가 반환해준 서비스 위치를 알아내서 라운드로빈형태로 로드밸런싱 해준다.
 * @version 1.00 2024-01-24 (수)
 * @author bom1boyy
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayServiceApplication {

	/**
	 * Spring 어플리에키션 수행을 위한 main method
	 * @param
	 * @return
	 * @Exception
	 */
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}
