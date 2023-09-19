package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.OrderDetail;

public interface OrderDetailRepo extends JpaRepository<OrderDetail, String>{

}
