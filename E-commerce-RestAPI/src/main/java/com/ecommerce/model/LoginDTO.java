package com.ecommerce.model;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class LoginDTO {

    @NotNull
	private Long mobileNo;
    @NotNull
	private String password;
}
