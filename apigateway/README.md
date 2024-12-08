# api-gateway
- https://cloud.spring.io/spring-cloud-gateway/reference/html/#gateway-starter

### 프로젝트 init
1. spring initializer 
2. maven, jar, jdk17 선택
3. dependency(gateway, lombok) 선택

### spring cloud gateway
Spring Cloud Gateway는 Spring 생태계의 일부로, 마이크로서비스 아키텍처에서 API Gateway 역할을 수행하는 프로젝트.

주요기능   
라우팅: 클라이언트 요청을 적절한 마이크로서비스로 전달.   
필터링: 요청과 응답을 변환하거나 수정할 수 있는 다양한 필터를 제공.   
로드 밸런싱: 여러 인스턴스 간에 트래픽을 분산.   
보안: 인증 및 인가 기능을 제공.   
모니터링: 요청 및 응답에 대한 로깅과 모니터링 기능을 지원.   

Spring Cloud Gateway는 Spring Boot와 통합되어 쉽게 설정하고 확장할 수 있으며, 비동기 및 반응형 프로그래밍 모델을 지원한다.
