package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class Refrigerator {
    private Integer refrigeratorId ;
    private String refrigeratorName ;
    private Integer brandModelId ;
    private Integer holdbyUserId ;
    private Double tempCooler ;
    private Double tempPreserve ;
    private Double tempFrezzer ;
}
