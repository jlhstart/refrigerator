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
/*    @DateTimeFormat(pattern = "yyy-MM-dd")
    @JsonFormat(pattern = "yyy-MM-dd")*/
    private Date dateStore ;
/*    @DateTimeFormat(pattern = "yyy-MM-dd")
    @JsonFormat(pattern = "yyy-MM-dd")*/
    private Date dateExpired;
}
