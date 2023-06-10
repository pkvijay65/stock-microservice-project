package com.example.stockpriceapplication.service;

import com.example.stockpriceapplication.entity.Stock;
import com.example.stockpriceapplication.exception.StockNotFoundException;
import com.example.stockpriceapplication.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockPriceServiceimpl implements IStockPriceService {

  @Autowired
  private StockRepository repo;

  @Override
  public Double findByCompanyName(String companyName) {

    Stock stock = repo.findByCompanyName(companyName);
    if (stock == null) {
      throw new StockNotFoundException("Company stock information is not present in Database");
    }

    return stock.getCompanyPrice();
  }

}