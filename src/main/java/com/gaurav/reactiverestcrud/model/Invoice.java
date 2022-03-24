package com.gaurav.reactiverestcrud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document
@AllArgsConstructor
@Getter
@Setter
public class Invoice {
	
	@Id
	private Integer id;
	private String name;
	private String number;
	private Double amount;
}
