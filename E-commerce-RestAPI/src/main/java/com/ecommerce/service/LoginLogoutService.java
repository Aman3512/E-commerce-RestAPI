package com.ecommerce.service;

import javax.security.auth.login.LoginException;

import com.ecommerce.exception.LogoutException;
import com.ecommerce.model.Current_Admin_session;
import com.ecommerce.model.Current_User_session;
import com.ecommerce.model.LoginDTO;

public interface LoginLogoutService {

	
	public String loginAdmin(LoginDTO login)throws LoginException;

	public String LogoutAdmin(String key)throws LogoutException;
	
	public String loginUser(LoginDTO login)throws LoginException;
	
	public String LogoutUser(String key)throws LogoutException;
	
	public boolean adminAuthentication(String key)throws LoginException;
	
	public boolean userAuthentication(String key)throws LoginException;

}
