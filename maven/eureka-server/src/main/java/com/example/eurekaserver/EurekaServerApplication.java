package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 유레카 서버 구동을 위한 클래스 선언
 *  < 수행역할 >
 * 	 1. 수행중인 서비스들의 위치를 discover 해주는 역할이다.
 * 	 2. 유레카 서버는 서비스들의 위치를 알고 있어서 필요할 때 서비스의 위치를 return해준다.
 * @version 1.00 2024-01-24 (수)
 * @author bom1boyy
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	/**
	 * Spring 어플리에키션 수행을 위한 main method
	 * @param
	 * @return
	 * @Exception
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
