package com.refrigerator_management.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Storedtl {
    private Integer storeId ;
    private Integer refrigeratorId ;
    private Integer contentId ;
    private Integer storeLayerId ;
    private Double contentAmount ;
    private String contentUnit ;
    private Date storeOnDate ;
    private Date qualityGuaranteeBefore ;
}
