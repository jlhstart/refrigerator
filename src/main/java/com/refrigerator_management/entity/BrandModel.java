package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class BrandModel {
    private Integer id ;
    private String brand ;
    private String model ;
    private Boolean hasCooler ;
    private Boolean hasPreserve ;
    private Boolean hasFreezer ;
    private String image ;
}
