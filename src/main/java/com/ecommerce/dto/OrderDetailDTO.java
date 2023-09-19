package com.ecommerce.dto;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.domain.Order;
import com.ecommerce.domain.Product;

import lombok.Data;

@Data
public class OrderDetailDTO {
	
	 private String id;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "ORDER_ID", nullable = false, //
	            foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
	    private Order order;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "PRODUCT_ID", nullable = false, //
	            foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK"))
	    private Product product;

	    @Column(name = "Quanity", nullable = false)
	    private int quanity;

	    @Column(name = "Price", nullable = false)
	    private double price;

	    @Column(name = "Amount", nullable = false)
	    private double amount;


}
