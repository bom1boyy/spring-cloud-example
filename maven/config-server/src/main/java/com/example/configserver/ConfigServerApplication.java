package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config 설정정보 동적관리를 위한 서버 선언
 *  < 수행역할 >
 *   1. github에 연결하여 config 설정 정보들을 관리할 수 있도록 한다.
 *   2. 필요시, config client 서비스들에게 해당 정보들을 return 해준다.
 * @version 1.00 2024-01-24 (수)
 * @author bom1boyy
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	/**
	 * Spring 어플리에키션 수행을 위한 main method
	 * @param
	 * @return
	 * @Exception
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
