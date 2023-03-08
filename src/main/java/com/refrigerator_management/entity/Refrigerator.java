package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class Refrigerator {
    private Integer id ;
    private String name ;
    private Integer brandModelId ;
    private Integer userId ;
    private Double tempCooler ;
    private Double tempPreserve ;
    private Double tempFreezer ;
}
