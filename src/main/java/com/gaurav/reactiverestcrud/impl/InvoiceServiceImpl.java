package com.gaurav.reactiverestcrud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.reactiverestcrud.model.Invoice;
import com.gaurav.reactiverestcrud.repo.InvoiceRepository;
import com.gaurav.reactiverestcrud.service.IInvoiceService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InvoiceServiceImpl implements IInvoiceService{

	@Autowired
	InvoiceRepository repo;
	
	@Override
	public Mono<Invoice> saveInvoice(Invoice invoice) {
		return repo.save(invoice);
	}

	@Override
	public Flux<Invoice> findAllInvoices() {
		return repo.findAll().switchIfEmpty(Flux.empty());
	}

	@Override
	public Mono<Invoice> getOneInvoice(Integer id) {
		return repo.findById(id).switchIfEmpty(Mono.empty());
	}

	@Override
	public Mono<Void> deleteInvoice(Integer id) {
		return repo.deleteById(id);
	}

}
