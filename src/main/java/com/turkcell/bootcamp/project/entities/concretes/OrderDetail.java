package com.turkcell.bootcamp.project.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
	
	@ManyToOne()
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;
	
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;
    
    @Column(name = "unit_price")
    private float unit_price;
    
    @Column(name = "quantity")
    private short quantity;
    
    @Column(name = "discount")
    private float discount;
}
