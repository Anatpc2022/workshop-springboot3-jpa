package com.anatpc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anatpc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
