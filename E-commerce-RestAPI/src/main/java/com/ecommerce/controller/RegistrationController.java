package com.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.AdminException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Admin;
import com.ecommerce.model.User;
import com.ecommerce.service.RegistrationService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService regService;
	
	@PostMapping("myShop/Admins")
	public ResponseEntity<String> registerAdminHandler(@Valid @RequestBody Admin admin) throws AdminException{
		
		String res = regService.registerAdmin(admin);
		
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
		
	}
	
	@PostMapping("myShop/Users")
	public ResponseEntity<String> registerUserHandler(@Valid @RequestBody User user) throws UserException{
		
		String res = regService.registerUser(user);
		
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
		
	}
}
