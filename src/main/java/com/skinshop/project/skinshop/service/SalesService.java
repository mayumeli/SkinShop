package com.skinshop.project.skinshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skinshop.project.skinshop.dto.SalesDTO;
import com.skinshop.project.skinshop.models.Sales;
import com.skinshop.project.skinshop.repository.SalesRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SalesService implements ISalesService {
    
    private final SalesRepo salesRepo;

    @Override
    public SalesDTO createSale(Sales sales) {
        return new SalesDTO(salesRepo.save(sales));
    }

    @Override
    public List<Sales> getAllSales() {
        return salesRepo.findAll();
    }

}
