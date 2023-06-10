package com.example.stockcalculationservice.service;

public interface IStockService {
  public Double calculateStockPrice(String companyName, Integer noOfShares);
}
