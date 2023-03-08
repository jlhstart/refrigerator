package com.refrigerator_management.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Stored {
    private Integer id ;
    private Integer refrigeratorId ;
    private Integer contentId ;
    private Integer layerId ;
    private Double amount ;
    private String unit ;
    private Date dateStore ;
    private Date dateExpired;
}
