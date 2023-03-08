package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class Layer {
    private Integer id ;
    private String name ;
    private Double lowestTemp ;
    private Double highestTemp ;
}
