package com.hsbc.hbar.mdw.consumerloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerLoan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "El nombre no puede ser nulo")
	private String name;
	private String docType;
	private String doc;
	private String adress;
	private Long clientNumber;
	
}
