package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer productId;
	
	@NotNull(message = "Name Can't be null")
	@NotEmpty(message = "Name can't be empty")
	private String productName;
	
	@NotNull(message = "Price can't be null")
	private Long price;

	private String category;
	
	private String manufacturer;
	
	private Integer quantity;
	
}
