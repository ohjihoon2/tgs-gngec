package io.tgsinc.tgsgngec.global.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


    /**
     * Data Auditing 처리 - 유저 정보
     * @return
     */
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> {
            ServletRequestAttributes attr
                    = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            //TODO 추후 session 값 수정
            String currentUser = (String)attr.getRequest().getSession().getAttribute("uidx");

            if(currentUser != null)
                return Optional.of(currentUser);
            else
                return Optional.of("Anonymous");
        };
    }
}
