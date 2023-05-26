package com.turkcell.bootcamp.project.entities.concretes;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private short orderId;
	
	@ManyToOne()
	@JoinColumn(name = "customer_id")
	private Customer customer; 
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "order_date")
	private Date orderDate;
	
	@Column(name = "required_date")
	private Date requiredDate;
	
	@Column(name = "shipped_date")
	private Date shippedDate;
	
	@Column(name = "ship_via")
	private short shipVia;
	
	@Column(name = "freight")
	private float freight;
	
	@Column(name = "ship_name")
	private String shipName;
	
	@Column(name = "ship_address")
	private String shipAddress;
	
	@Column(name = "ship_city")
	private String shipCity;
	
	@Column(name = "ship_region")
	private String shipRegion;
	
	@Column(name = "ship_postal_code")
	private String shipPostalCode;
	
	@Column(name = "ship_country")
	private String shipCountry;
	
}
