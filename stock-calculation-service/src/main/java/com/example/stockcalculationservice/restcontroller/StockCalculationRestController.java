package com.example.stockcalculationservice.restcontroller;

import com.example.stockcalculationservice.service.IStockService;
import com.example.stockcalculationservice.service.StockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class StockCalculationRestController {
  private final IStockService stockService;
  @Autowired
  public StockCalculationRestController(StockServiceImpl stockService) {
    this.stockService = stockService;
  }

  @GetMapping("/{companyName}/{quantity}")
  public ResponseEntity<String> calculate(@PathVariable String companyName, @PathVariable Integer quantity) {
    try {
      Double totalPrice = stockService.calculateStockPrice(companyName, quantity);
      String response = "Total cost: " + totalPrice;
      return new ResponseEntity<>(response, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>("Company not found", HttpStatus.BAD_REQUEST);
    }
  }
}
