package com.ecommerce.dto;

import java.util.Date;

import lombok.Data;

@Data
public class OrderDTO {

	private String id;

	private Date orderDate;

	private int orderNum;

	private double amount;

	private String customerName;

	private String customerAddress;

	private String customerEmail;

	private String customerPhone;

}
