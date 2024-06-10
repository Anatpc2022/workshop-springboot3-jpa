package com.anatpc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anatpc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}



