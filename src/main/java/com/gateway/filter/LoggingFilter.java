package com.gateway.filter;

import java.io.IOException;
import java.time.LocalDateTime;

import com.gateway.entity.RequestLog;
import com.gateway.service.GatewayService;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoggingFilter implements Filter {

    private final GatewayService gatewayService;

    public LoggingFilter(
            GatewayService gatewayService) {

        this.gatewayService = gatewayService;
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req =
                (HttpServletRequest) request;

        HttpServletResponse res =
                (HttpServletResponse) response;

        long startTime =
                System.currentTimeMillis();

        chain.doFilter(request, response);

        long endTime =
                System.currentTimeMillis();

        System.out.println("================================");

        System.out.println(
                "Request URL : "
                        + req.getRequestURI());

        System.out.println(
                "HTTP Method : "
                        + req.getMethod());

        System.out.println(
                "Request Time : "
                        + (endTime - startTime)
                        + " ms");

        System.out.println(
                "Response Status : "
                        + res.getStatus());

        System.out.println("================================");

        RequestLog log = new RequestLog();

        log.setRequestPath(
                req.getRequestURI());

        log.setMethod(
                req.getMethod());

        log.setTimestamp(
                LocalDateTime.now());

        log.setStatus(
                res.getStatus());

        gatewayService.saveLog(log);
    }
}
