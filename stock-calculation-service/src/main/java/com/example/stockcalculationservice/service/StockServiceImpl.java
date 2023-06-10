package com.example.stockcalculationservice.service;

import com.example.stockcalculationservice.client.StockClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements IStockService {

  private final StockClient stockClient;

  public StockServiceImpl(StockClient stockClient) {
    this.stockClient = stockClient;
  }

  public Double calculateStockPrice(String companyName, Integer noOfShares) {
    ResponseEntity<Double> responseEntity = stockClient.getStockPrice(companyName);
    if (responseEntity.getStatusCode().is2xxSuccessful()) {
      Double companyStockPrice = responseEntity.getBody();
      return companyStockPrice * noOfShares;
    } else {
      throw new IllegalArgumentException("Company not found, Error thrown in Stock Calculation MicroService");
    }
  }
}
