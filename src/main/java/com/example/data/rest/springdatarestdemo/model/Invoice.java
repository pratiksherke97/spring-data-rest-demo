package com.example.data.rest.springdatarestdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double amount;
    private Double finalAmount;
    private String number;
    private String receivedDate;
    private String type;
    private String vendor;
    private String comments;
}
