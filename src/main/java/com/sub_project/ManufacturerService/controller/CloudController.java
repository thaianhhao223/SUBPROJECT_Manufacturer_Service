package com.sub_project.ManufacturerService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/manufacturers")
public class CloudController {
    @Value("${welcome}")
    private String welcome;
    @GetMapping("/infor")
    public String projectInformation(){
        return welcome;
    }
}
