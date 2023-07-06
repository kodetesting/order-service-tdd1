package com.demo.multi.orderservicetddapi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getProjectDetails(String projectName) {
        return "DB:" + projectName;
    }
}
