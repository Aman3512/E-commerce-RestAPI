package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.ProductException;
import com.ecommerce.model.Product;

public interface UserService {

	public List<Product> getAllProducts()throws ProductException;
	
	public List<Product> sortByPriceAscOrder()throws ProductException;
	
	public List<Product> sortByPricedescOrder()throws ProductException;

    public List<Product> sortByRatingAscOrder()throws ProductException;
	
	public List<Product> sortByRatingdescOrder()throws ProductException;
	
//	public String addToCart()
	
}
