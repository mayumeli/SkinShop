package com.skinshop.project.skinshop.service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Override
    public void cancelSale(Long id) {
        Sales sale = salesRepo.findById(id).get();

        Date today = new Date();
        Date saleDate = sale.getDate();
        Long difference = today.getTime() - saleDate.getTime();
        long days = TimeUnit.MILLISECONDS.toDays(difference);

        if (days <= 5) {
            sale.setStatus(false);
            sale.setCanceledAt(today);
            salesRepo.save(sale);
            System.out.println("Sale canceled");
        } else {
            System.out.println("You can not cancel this sale");
        }
    }

}
