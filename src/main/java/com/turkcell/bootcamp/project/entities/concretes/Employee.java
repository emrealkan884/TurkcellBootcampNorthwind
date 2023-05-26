package com.turkcell.bootcamp.project.entities.concretes;

import java.sql.Date;
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
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short employeeId;
	
	@OneToMany(mappedBy = "employee")
	private List<Order> orders;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "title_of_courtesy")
	private String titleOfCourtesy;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
	@Column(name = "hire_date")
	private Date hireDate;
	
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
	
	@Column(name = "home_phone")
	private String homePhone;
	
	@Column(name = "extension")
	private String extension;

	@Column(name = "photo")
	private byte[] photo;
	
	@Column(name = "notes")
	private String notes;
	
	@Column(name = "reports_to")
	private short reportsTo;
	
	@Column(name = "photo_path")
	private String photoPath;

	
}
