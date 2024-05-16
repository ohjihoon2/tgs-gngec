package io.tgsinc.tgsgngec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TgsGngecApplication {

    public static void main(String[] args) {
        SpringApplication.run(TgsGngecApplication.class, args);
    }

}
