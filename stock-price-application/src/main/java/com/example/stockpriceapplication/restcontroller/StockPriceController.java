package com.example.stockpriceapplication.restcontroller;

import com.example.stockpriceapplication.service.IStockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/price")
public class StockPriceController {

  @Autowired
  private IStockPriceService service;

  @GetMapping("/{companyName}")
  public ResponseEntity<Double> getStockPrice(@PathVariable String companyName) {

    Double price = service.findByCompanyName(companyName);
    System.out.println(companyName + " " + price);

    return new ResponseEntity<Double>(price, HttpStatus.OK);
  }

}
