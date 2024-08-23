package com.makersharks.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.makersharks.model.Supplier;
import com.makersharks.service.SupplierService;


@RestController
@RequestMapping("/api/supplier")
@Validated
public class SupplierController {

	@Autowired
	private SupplierService service;
	
	@PostMapping("/query")
	public ResponseEntity<Page<Supplier>> getSupplier(@RequestParam @NotBlank String location, @RequestParam @NotBlank String natureOfBusiness, @RequestParam @NotBlank String manufacturingProcess, 
			@RequestParam @Min(0) int page, @RequestParam @Min(1) int size) {
		
		Page<Supplier> suppliers = service.getSuppliers(location, natureOfBusiness, manufacturingProcess, page, size);
		return new  ResponseEntity<>(suppliers, HttpStatus.FOUND);
	}
	
}
