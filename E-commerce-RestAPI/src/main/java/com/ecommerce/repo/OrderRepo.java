package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {

}


