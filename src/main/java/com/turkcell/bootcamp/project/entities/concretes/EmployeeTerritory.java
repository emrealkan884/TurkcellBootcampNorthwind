package com.turkcell.bootcamp.project.entities.concretes;

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
@Table(name = "employee_territories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeTerritory {
	
	@ManyToOne()
	@MapsId("employeeId")//Employee sinifinin icindeki degisken
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@ManyToOne()
	@MapsId("territoryId")
	@JoinColumn(name = "territory_id")//Veritabanindaki column
	private Territory territory;//Territory sinifinin icindeki degisken
}
