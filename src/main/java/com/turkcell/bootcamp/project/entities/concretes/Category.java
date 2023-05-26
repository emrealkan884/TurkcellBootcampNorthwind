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
@Table(name = "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short categoryId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "picture")
	private byte[] picture;
	
	@OneToMany(mappedBy = "category")//Product daki degiskenin ismi olmali
	private List<Product> products;
	
	
}
