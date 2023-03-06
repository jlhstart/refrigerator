package com.refrigerator_management.entity;

import lombok.Data;

@Data
public class RefrigeratorLayerInfo {
    private Integer layerId ;
    private String layerName ;
    private Double recommendLow ;
    private Double recommendHigh ;
}
