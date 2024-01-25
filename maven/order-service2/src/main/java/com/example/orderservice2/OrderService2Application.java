package com.example.orderservice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Order서비스2 선언
 *  < 수행역할 >
 * 	1. Eureka 클라이언트로서 등록 ( @EnableDiscoveryClient )
 * 	2. RestController 역할 ( @RestController )
 * 	3. Config 클라이언트로서 등록되고, 설정정보가 바뀌면 actuator/refresh를 통해 동적관리 대상이됨. ( @RefreshScope )
 * @version 1.00 2024-01-24 (수)
 * @author bom1boyy
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class OrderService2Application {

	/**
	 * Spring 어플리에키션 수행을 위한 main method
	 * @param
	 * @return
	 * @Exception
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderService2Application.class, args);
	}

	/**
	 * <ip>:<port>/명시url로 요청 시, 구동중인 포트를 return 해주는 메서드
	 * @param String port ( application.yaml 파일에 명시 된, 현재 어플리케이션 구동포트를 파라미터로 전달함 )
	 * @return String port ( 전달받은 포트값을 return )
	 * @Exception
	 */
	@RequestMapping("/order/info")
	public String info(@Value("${server.port}") String port) {
		return "(2) Order 서비스의 기본동작 port : {" + port + "}";
	}

	/** config server 에 등록된 .yaml 파일을 읽어와서 변수로 선언 후 사용 */
	@Value("${what.is.your.name}")
	private String serviceName;

	/**
	 * <ip>:<port>/명시url로 요청 시, config 등록정보를 return 해주는 메서드
	 * @param
	 * @return String serviceName ( config 서버가 가지고 있는 서비스 이름을 return 해준다. git hub에서 수정되면 actuator 사용하여 동적 변경가능 )
	 * @Exception
	 */
	@RequestMapping( "/order/name" )
	public String serviceName(){
		return serviceName;
	}
}
