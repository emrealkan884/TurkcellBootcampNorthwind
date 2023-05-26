package com.turkcell.bootcamp.project.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@Column(name = "customer_id")
	private char customerId;
	
	@OneToMany(mappedBy = "customer")//Order daki degiskenin ismi olmali
	private List<Order> orders;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "contact_name")
	private String contactName;
	
	@Column(name = "contact_title")
	private String contactTitle;

	@Column(name = "adress")
	private String adress;
	
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
	

}
