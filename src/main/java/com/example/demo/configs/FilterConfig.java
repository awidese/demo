package com.example.demo.configs;

import com.example.demo.filter.Myfilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registFilter(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.setFilter(new Myfilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("MyFilter");
        registrationBean.setOrder(1);

        return registrationBean;
    }
}
