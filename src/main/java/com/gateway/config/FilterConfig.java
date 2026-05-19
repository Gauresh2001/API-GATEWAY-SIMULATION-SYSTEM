package com.gateway.config;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gateway.filter.LoggingFilter;
import com.gateway.service.GatewayService;

@Configuration
public class FilterConfig {

    @Bean
    public LoggingFilter loggingFilter(GatewayService gatewayService) {
        return new LoggingFilter(gatewayService);
    }

    @Bean
    public FilterRegistrationBean<LoggingFilter> loggingFilterRegistration(
            LoggingFilter loggingFilter) {

        FilterRegistrationBean<LoggingFilter> registrationBean =
                new FilterRegistrationBean<>();

        registrationBean.setFilter(loggingFilter);

        registrationBean.addUrlPatterns("/api/*");

        registrationBean.setOrder(1);

        return registrationBean;
    }
}
