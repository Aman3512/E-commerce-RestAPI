package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull(message = "Name can't be null")
	private String name;
	
	@NotNull(message = "Mobile no. is Mandatory")
	@Column(unique = true)
	private Long mobileNo;  // username
	
	@Email(message = "Invalid Email")
	private String email;
	
	@NotNull(message = "Password can't be null")
	private String password;
	
	
}
