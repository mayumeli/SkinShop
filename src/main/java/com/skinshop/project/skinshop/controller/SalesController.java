package com.skinshop.project.skinshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skinshop.project.skinshop.models.Sales;
import com.skinshop.project.skinshop.service.ISalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {
    
    @Autowired
    private ISalesService salesService;

    @PostMapping
    public ResponseEntity<Sales> createSales(@RequestBody Sales sales) {
        return new ResponseEntity<>(salesService.createSale(sales), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Sales>> getAllSales(){
        return new ResponseEntity<>(salesService.getAllSales(), HttpStatus.OK);
    }
}
