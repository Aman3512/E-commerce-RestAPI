package com.ecommerce.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Payment {

	@NotNull(message = "name can't be null")
	private String name;
	
	@CreditCardNumber
	private Long cardNumber;
	
	@Size(min=3 , max=3)
	@NotNull(message = "cvv can't be null")
	private Integer cvv;
	
}
