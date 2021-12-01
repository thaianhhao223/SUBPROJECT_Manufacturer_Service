package com.sub_project.ManufacturerService.service;

import com.sub_project.ManufacturerService.entity.Manufacturer;
import com.sub_project.ManufacturerService.repository.ManufacturerRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepositoty manufacturerRepositoty;

    public Manufacturer saveManufacturer(Manufacturer manufacturer) {
//        log.info("Inside saveDepartment of Service! ");
        return manufacturerRepositoty.save(manufacturer);
    }

    public Manufacturer findDeparmentById(String manufacturerId) {
//        log.info("inside findDeparmentById ");
        return manufacturerRepositoty.findById(manufacturerId).get();
    }
    public List<Manufacturer> findAllDeparment() {
//        log.info("inside findDeparmentById ");
        return manufacturerRepositoty.findAll();
    }
}
