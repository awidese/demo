package com.example.demo.configs;

import com.example.demo.interceptor.FirstHandleInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //注册拦截器
        FirstHandleInterceptor firstHandleInterceptor=new FirstHandleInterceptor();
        InterceptorRegistration interceptorRegistration=registry.addInterceptor(firstHandleInterceptor);

        //拦截路径

        interceptorRegistration.excludePathPatterns("/loginpage");
        interceptorRegistration.excludePathPatterns("/login");
        interceptorRegistration.excludePathPatterns("/static/**");
        interceptorRegistration.excludePathPatterns("/signin");
        interceptorRegistration.addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
