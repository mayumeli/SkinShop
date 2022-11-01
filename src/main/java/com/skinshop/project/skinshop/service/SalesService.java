package com.skinshop.project.skinshop.service;

import org.springframework.stereotype.Service;

import com.skinshop.project.skinshop.models.Sales;
import com.skinshop.project.skinshop.repository.SalesRepo;
import com.skinshop.project.skinshop.repository.SkinRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SalesService implements ISalesService {
    
    private final SalesRepo salesRepo;

    @Override
    public Sales createSale(Sales sales) {
        return salesRepo.save(sales);
    }
}
