package com.gaurav.reactiverestcrud.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.gaurav.reactiverestcrud.model.Invoice;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer>{

}
