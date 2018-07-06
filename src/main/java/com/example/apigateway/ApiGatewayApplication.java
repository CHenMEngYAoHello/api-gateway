package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }




    @Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean<AccessFilter> filterFilterRegistrationBean=new FilterRegistrationBean<AccessFilter>();
        filterFilterRegistrationBean.setFilter(new AccessFilter());

        return filterFilterRegistrationBean;
    }
}
