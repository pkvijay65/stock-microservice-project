package com.example.stockpriceapplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="Stock")
public class Stock {

  @Id
  @Column(name = "Stock_id")
  private Integer stockId;

  @Column(name = "Company_name")
  private String companyName;

  @Column(name = "Company_price")
  private Double companyPrice;

}
