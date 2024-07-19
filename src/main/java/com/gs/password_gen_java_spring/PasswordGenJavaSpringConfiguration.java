package com.gs.password_gen_java_spring;

import com.gs.password_gen_java_spring.service.GenerateService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PasswordGenJavaSpringConfiguration {

    @Bean
    public GenerateService getGenerateService() {
        return new GenerateService();
    }
}
