package com.ecommerce.service;

import com.ecommerce.exception.AdminException;
import com.ecommerce.exception.UserException;
import com.ecommerce.model.Admin;
import com.ecommerce.model.User;

public interface RegistrationService {

	public String registerAdmin(Admin admin)throws AdminException;
	
	public String registerUser(User user)throws UserException;
}
