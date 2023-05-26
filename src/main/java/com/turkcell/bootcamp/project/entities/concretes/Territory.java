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
@Table(name = "territories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Territory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "territory_id")
	private short territoryId;
	
	@Column(name = "territory_description")
	private char territoryDescription;
	
	@ManyToOne()
	@JoinColumn(name = "region_id")
	private Region region;
}
