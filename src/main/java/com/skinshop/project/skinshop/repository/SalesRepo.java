package com.skinshop.project.skinshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skinshop.project.skinshop.models.Sales;

public interface SalesRepo extends JpaRepository<Sales, Long> {
    
}
