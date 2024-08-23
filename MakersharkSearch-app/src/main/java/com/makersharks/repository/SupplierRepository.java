package com.makersharks.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.makersharks.model.Supplier;


public interface SupplierRepository extends JpaRepository<Supplier, Long> {
	
	@Query(value = "SELECT * FROM supplier s WHERE s.location = :location AND s.nature_of_business = :natureOfBusiness AND s.manufacturing_processes = :manufacturingProcesses", nativeQuery = true)
	Page<Supplier> findSuppliers(@Param("location") String location, @Param("natureOfBusiness") String natureOfBusiness, @Param("manufacturingProcesses") String manufacturingProcesses, Pageable pageable);

}
