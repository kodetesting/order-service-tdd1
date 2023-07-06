package com.demo.multi.orderservicetddapi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getProjectDetails(String projectName) {
        return "DB:" + projectName;
    }

    public int sumService(int n1, int n2) {
        return n1 + n2;
    }

    public int diffService(int n1, int n2) {
        return n1 - n2;
    }
}
