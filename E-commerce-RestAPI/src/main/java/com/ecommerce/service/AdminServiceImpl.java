package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.exception.OrderException;
import com.ecommerce.exception.ProductException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.repo.OrderRepo;
import com.ecommerce.repo.ProductRepo;
import com.ecommerce.repo.UserRepo;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private ProductRepo proRepo;
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public Product addProduct(Product product) {
		return proRepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> list = proRepo.findAll();
		
		if(list.isEmpty()) throw new ProductException("No product found...");
		
		return list;
	}

	@Override
	public List<Orders> getAllOrdersDetails() throws OrderException {
		
		List<Orders> list = orderRepo.findAll();
		
		if(list.isEmpty()) throw new OrderException("No Order found...");
		
		return list;
		
	}

	@Override
	public Orders searchOrderById(Integer orderId) throws OrderException {
		
		Optional<Orders> opt = orderRepo.findById(orderId);
		
		if(opt.isPresent()) {
			
			return opt.get();
			
		}else 
			throw new OrderException("No order found with id : " + orderId);
		
		
	}

	@Override
	public User searchUserDetailById(Integer userId) throws UserException {
		
		Optional<User> opt = userRepo.findById(userId);
		
		if(opt.isPresent()) {
			
			return opt.get();
			
		}else 
			throw new UserException("No User found with id : " + userId);
		
		
	}

	@Override
	public List<User> getAllUserDetails() throws UserException {
		
		List<User> list = userRepo.findAll();
		
		if(list.isEmpty()) throw new UserException("No User found...");
		
		return list;
	}

}
