package com.makersharks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.makersharks.model.Supplier;
import com.makersharks.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository repository;
	
	public Page<Supplier> getSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, int page, int size){
		
		Pageable pageable = PageRequest.of(page, size);
		return repository.findSuppliers(location, natureOfBusiness,
				manufacturingProcesses, pageable);
         
	}
}
