package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/test")
    public String dc() {
        String services = "Services";
        System.out.println(services);
        return services;
    }
}
