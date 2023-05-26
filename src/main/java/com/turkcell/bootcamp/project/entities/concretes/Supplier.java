package com.turkcell.bootcamp.project.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
	
	@Id
	@Column(name = "supplier_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private short supplierId;
	
	@OneToMany(mappedBy = "supplier")//Product daki degiskenin ismi
	private List<Product> products;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "contact_name")
	private String contactName;
	
	@Column(name = "contact_title")
	private String contactTitle;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "fax")
	private String fax;
	
	@Column(name = "homepage")
	private String homepage;

}
