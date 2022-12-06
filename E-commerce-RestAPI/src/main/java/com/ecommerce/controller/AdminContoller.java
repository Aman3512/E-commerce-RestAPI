package com.ecommerce.controller;

import java.util.List;

import javax.persistence.criteria.Order;
import javax.security.auth.login.LoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.OrderException;
import com.ecommerce.exception.ProductException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.service.AdminService;
import com.ecommerce.service.LoginLogoutService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/myShop")
public class AdminContoller {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private LoginLogoutService loginService;
	
	
	@PostMapping("/products")
	public ResponseEntity<Product> addProductHandler( @Valid String key , @RequestBody Product product) throws LoginException{
		
		loginService.adminAuthentication(key);
		
		Product pro = adminService.addProduct(product);
		
		return new ResponseEntity<Product>(pro,HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProductsHandler(String key) throws ProductException, LoginException{
		
		loginService.adminAuthentication(key);
		
		List<Product> list = adminService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/orders")
	public ResponseEntity<List<Orders>> getAllOrdersDetailsHandler(String key) throws OrderException, LoginException{
		
		loginService.adminAuthentication(key);
		
		List<Orders> list = adminService.getAllOrdersDetails();
		
		return new ResponseEntity<List<Orders>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<Orders> searchOrderByIdHandler(String key ,@PathVariable Integer id) throws OrderException, LoginException{
		
		loginService.adminAuthentication(key);
		
		Orders order = adminService.searchOrderById(id);
		
		return new ResponseEntity<Orders>(order,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUserDetailsHandler(String key) throws UserException, LoginException{
		
		loginService.adminAuthentication(key);
		
		List<User> list = adminService.getAllUserDetails();
		
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> searchUserDetailByIdHandler(String key ,@PathVariable Integer id) throws UserException, LoginException{
		
		loginService.adminAuthentication(key);
		
		User user = adminService.searchUserDetailById(id);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	
	
	
	
	
}
