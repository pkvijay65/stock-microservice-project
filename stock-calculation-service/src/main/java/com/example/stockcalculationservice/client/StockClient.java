package com.example.stockcalculationservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "STOCK-PRICE-SERVICE")
public interface StockClient {

  @GetMapping("/price/{companyName}")
  public ResponseEntity<Double> getStockPrice(@PathVariable String companyName);

}