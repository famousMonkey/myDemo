package com.song.demo.config;

import com.song.demo.common.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(initMyInterceptor()).addPathPatterns("/**");//拦截路径
    }

    @Bean
    public MyInterceptor initMyInterceptor(){
        return new MyInterceptor();
    }
}
