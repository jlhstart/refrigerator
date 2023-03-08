package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class BrandModel {
    private Integer id ;
    private String brand ;
    private String model ;
    private Integer hasCooler ;
    private Integer hasPreserve ;
    private Integer hasFreezer ;
    private String image ;
}
