package com.ecommerce.dto;

import java.util.Date;

import lombok.Data;
@Data
public class ProductDTO {

    private String code;

    private String name;

    private double price;

    private byte[] image;
    
    private Date createDate;

}
