package com.refrigerator_management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Store {
    private Integer id ;
    private Integer refrigeratorId ;
    private Integer contentId ;
    private Integer layerId ;
    private Double amount ;
    private String unit ;
    private Date dateStore ;
    private Date dateExpired;
}
