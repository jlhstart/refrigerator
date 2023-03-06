package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class BrandModel {
    private Integer brandModelId ;
    private String brand ;
    private String model ;
    private Boolean hasCooler ;
    private Boolean hasPreserve ;
    private Boolean hasFrezzer ;
    private String image ;
}
