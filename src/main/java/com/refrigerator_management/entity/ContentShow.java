package com.refrigerator_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContentShow {
    public String content_name;
    public String content_image;
    public String temp_cooler;
    public String temp_preserve;
    public String temp_frezzer;
}
