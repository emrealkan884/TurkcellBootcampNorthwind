package com.turkcell.bootcamp.project.entities.concretes;

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
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short productId;
	
	@ManyToOne()
	@JoinColumn(name = "supplier_id")
	private Supplier supplier;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	
	@Column(name = "unit_price")
	private float unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "units_in_order")
	private short unitsOnOrder;
	
	@Column(name = "reorder_level")
	private short reorderLevel;
	
	@Column(name = "discontinued")
	private int discontinued;
}
