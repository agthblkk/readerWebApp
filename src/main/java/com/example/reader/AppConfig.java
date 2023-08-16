package com.example.reader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;


@Configuration
public class AppConfig implements WebMvcConfigurer {
    @Bean
    public BeanNameViewResolver beanNameViewResolver(){
        return new BeanNameViewResolver();
    }
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(100000);
        return multipartResolver;
    }
}
