package com.gateway.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.entity.RequestLog;
import com.gateway.repository.RequestLogRepository;

@Service
public class GatewayService {

    @Autowired
    private RequestLogRepository requestLogRepository;

    public void saveLog(RequestLog log) {

        requestLogRepository.save(log);
    }

    public List<RequestLog> getAllLogs() {

        return requestLogRepository.findAll();
    }
}
