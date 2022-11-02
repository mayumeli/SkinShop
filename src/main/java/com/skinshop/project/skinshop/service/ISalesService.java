package com.skinshop.project.skinshop.service;

import java.util.List;

import com.skinshop.project.skinshop.dto.SalesDTO;
import com.skinshop.project.skinshop.models.Sales;

public interface ISalesService {
    
    SalesDTO createSale(Sales sales);

    List<Sales> getAllSales();
}
