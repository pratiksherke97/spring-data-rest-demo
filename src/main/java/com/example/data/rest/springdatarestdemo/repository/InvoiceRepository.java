package com.example.data.rest.springdatarestdemo.repository;

import com.example.data.rest.springdatarestdemo.model.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
