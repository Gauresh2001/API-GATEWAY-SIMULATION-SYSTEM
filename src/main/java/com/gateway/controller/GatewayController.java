package com.gateway.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.entity.RequestLog;
import com.gateway.service.GatewayService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class GatewayController {

    @Autowired
    private GatewayService gatewayService;

    // ================= LOGS API =================

    @GetMapping("/logs")
    public List<RequestLog> getAllLogs() {

        return gatewayService.getAllLogs();
    }
}
