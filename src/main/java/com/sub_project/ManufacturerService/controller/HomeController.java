package com.sub_project.ManufacturerService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manufacturers")
public class HomeController {
    @GetMapping("/")
    public String getListManuFaturers(){
        return "Get getListManuFaturers hehe";
    }
}
