package com.makersharks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Supplier")
public class Supplier {
	
	@Id
	@Column(name = "supplierId")
	private Long supplierId;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "website")
	private String website;
	@Column(name = "location")
	private String location;
	@Column(name = "natureOfBusiness")
	private String natureOfBusiness;
	@Column(name = "manufacturingProcesses")
	private String manufacturingProcesses;

}
