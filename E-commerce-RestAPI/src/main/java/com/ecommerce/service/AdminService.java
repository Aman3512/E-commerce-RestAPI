package com.ecommerce.service;

import java.util.List;

import javax.persistence.criteria.Order;

import com.ecommerce.exception.OrderException;
import com.ecommerce.exception.ProductException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;

public interface AdminService {

	public Product addProduct(Product product);
	
	public List<Product> getAllProducts()throws ProductException;
	
	public List<Orders> getAllOrdersDetails()throws OrderException;
	
	public Orders searchOrderById(Integer orderId)throws OrderException;
	
	public User searchUserDetailById(Integer userId)throws UserException;
	
	public List<User> getAllUserDetails()throws UserException;
	
	
	
}
