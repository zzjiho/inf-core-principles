package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

    /**
     * HTTP 요청,응답 과거 기록 확인을 위한 빈 등록
     * 최대 100개의 HTTP 요청을 제공. 넘어가면 삭제한다. setCapacity()로 변경 가능
     *
     * 너무 단순하고 기능에 제한이 많아서 개발 단계에서만 사용하자.
     * 실제 운영 서비스에서는 모니터링 툴이나 핀포인트 같은 기술을 사용하자
     */
    @Bean
    public InMemoryHttpExchangeRepository httpExchangeRepository() {
        return new InMemoryHttpExchangeRepository();
    }

}
