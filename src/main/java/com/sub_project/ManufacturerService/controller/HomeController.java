package com.sub_project.ManufacturerService.controller;

import com.sub_project.ManufacturerService.entity.Manufacturer;
import com.sub_project.ManufacturerService.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/manufacturers")
public class HomeController {
    @Autowired
    private ManufacturerService manufacturerService;


    @PostMapping("/")
    public Manufacturer saveDeparment(@RequestBody Manufacturer manufacturer){
//        log.info("inside saveDeparment method if Department controller!");
        return manufacturerService.saveManufacturer(manufacturer);
    }

    @GetMapping("/manufacturer/{id}")
    public Manufacturer findDeparmentById(@PathVariable("id") String manufacturerId){
//        log.info("inside findDeparmentById method if Department controller!");
        return manufacturerService.findDeparmentById(manufacturerId);
    }
    @GetMapping("/")
    public List<Manufacturer> getListManuFaturers(){
        List<Manufacturer> listManu = new ArrayList<Manufacturer>();
        return listManu;
    }
}
