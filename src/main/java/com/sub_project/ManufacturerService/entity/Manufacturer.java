package com.sub_project.ManufacturerService.entity;

import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer{
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    @Column(columnDefinition = "NVarchar(255)")
    private String name;
    private int year;
    @Column(columnDefinition = "NVarchar(255)")
    private String country;
    @Column(columnDefinition = "text")
    private String url_ava;
}
