package com.anatpc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anatpc.course.entities.OrderItem;
import com.anatpc.course.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK>{
    
}
