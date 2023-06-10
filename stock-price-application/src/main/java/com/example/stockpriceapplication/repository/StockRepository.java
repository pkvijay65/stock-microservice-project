package com.example.stockpriceapplication.repository;

import com.example.stockpriceapplication.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
  public Stock findByCompanyName(String companyName);
}
