package com.turkcell.bootcamp.project.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "shippers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shipper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "shipper_id")
	private short shipperId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "phone")
	private String phone;
}
