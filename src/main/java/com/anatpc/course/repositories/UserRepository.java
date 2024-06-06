package com.anatpc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anatpc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
