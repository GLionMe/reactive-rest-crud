package com.gaurav.reactiverestcrud.service;

import com.gaurav.reactiverestcrud.model.Invoice;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IInvoiceService {
	Mono<Invoice> saveInvoice(Invoice invoice);
	Flux<Invoice> findAllInvoices();
	Mono<Invoice> getOneInvoice(Integer id);
	Mono<Void> deleteInvoice(Integer id);
}
