package com.ecommerce.service;

import java.util.List;

import javax.persistence.criteria.Order;

import com.ecommerce.exception.ProductException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;

public interface AdminService {

	public Product addProduct(Product product)throws ProductException;
	
	public List<Order> getAllOrdersDetails();
	
	public User searchUserDetailById(Integer id)throws UserException;
	
	public List<User> getAllUserDetails()throws UserException;
	
	
	
}
