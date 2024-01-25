< MAVEN 빌드 툴을 사용한 Spring Cloud 실습 >


# Spring Cloud Microservices Example

	이 프로젝트는 Spring Cloud를 사용하여 구현된 간단한 마이크로서비스 아키텍처를 보여줍니다.

## 모듈 소개

	1. **Eureka 서버 (eureka-server)**
	   - 서비스 디스커버리 및 레지스트리 역할을 하는 Eureka 서버입니다.
	   - [Eureka 서버 URL](http://localhost:8761)

	2. **Config 서버 (config-server)**
	   - 외부 구성 속성을 중앙에서 관리하는 Config 서버입니다.
	   - [Config 서버 URL](http://localhost:8888)

	3. **Spring Cloud Gateway 서버 (gateway-server)**
	   - API 게이트웨이로서 모든 외부 요청을 조정하는 서버입니다.
	   - [Gateway 서버 URL](http://localhost:8000)

	4. **Restful API 서비스 (api-service)**
	   - 간단한 RESTful API를 제공하는 서비스입니다.
	   - [API 서비스 URL](http://localhost:<각 서비스의 구동포트>/api)


## 실행 방법

	1. **Eureka 서버 실행**
		- http://localhost:8761 에 접속하여 등록된 서비스 레지스트리 확인

	2. **Config 서버 실행**
		- GitHub 과 연동하여 구성 속성을 중앙에서 관리 확인

	3. **Spring Cloud Gateway 서버 실행**
		- 기입된 정보로 구동할 서비스들의 로드밸런싱 확인

	4. **Restful API 서비스 실행**
		- 구동중인 Spring Cloud Gateway 서버로 요청하여 Round Robin 형태로 로드밸런싱 되는것 확인
		- actuator/refresh 기능을 사용하여, 각 서비스들의 구성 속성값 변경되는것 확인

## 관련 url

	- https://wonit.tistory.com/497
	- https://ingnoh.tistory.com/109
	- https://velog.io/@korea3611/Spring-Boot-Spring-Cloud-Config3-Actuator-refresh-MSA6
	- https://wonit.tistory.com/495?category=854728
	- https://enjoy-dev.tistory.com/12
