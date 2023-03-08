package com.refrigerator_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class ContentShow {
    private Integer id ;
    private Integer refrigeratorId ;
    private Integer contentId ;
    private Integer layerId ;
    private Double amount ;
    private String unit ;
    private Date dateStore ;
    private Date dateExpired;
    public String name;
    public String image;
    public Double tempCooler;
    public Double tempPreserve;
    public Double tempFreezer;
}
