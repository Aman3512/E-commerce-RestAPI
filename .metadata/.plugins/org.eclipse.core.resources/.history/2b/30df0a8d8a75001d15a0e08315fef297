package com.ecommerce.service;

import java.lang.StackWalker.Option;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.exception.LogoutException;
import com.ecommerce.model.Admin;
import com.ecommerce.model.Current_Admin_session;
import com.ecommerce.model.Current_User_session;
import com.ecommerce.model.LoginDTO;
import com.ecommerce.model.User;
import com.ecommerce.repo.AdminRepo;
import com.ecommerce.repo.Current_Admin_sessionRepo;
import com.ecommerce.repo.Current_User_sessionRepo;
import com.ecommerce.repo.UserRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginLogoutServiceImpl implements LoginLogoutService {

	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private Current_Admin_sessionRepo sessionRepo;
	
	@Autowired
	private Current_User_sessionRepo userSessionRepo;
	
	
	@Override
	public String loginAdmin(LoginDTO login) throws LoginException {
		
		Admin admin = adminRepo.findByMobileNo(login.getMobileNo());
		
		if(admin == null) throw new LoginException("No Admin found with mobileNO : " + login.getMobileNo());
			
		Optional<Current_Admin_session> opt = sessionRepo.findById(admin.getId());
		
		if(opt.isPresent()) {
			throw new LoginException("Admin already Logged In with session key : " + opt.get().getUuid());
		}
		
		
		
			if(login.getPassword().equals(admin.getPassword())) {
				
				String key = RandomString.make(6);
				
				Current_Admin_session currSession = new Current_Admin_session(admin.getId(), key, LocalDate.now());
				
				sessionRepo.save(currSession);
				
				return currSession.toString();
				
			}else
				throw new LoginException(" Wrong password... Try again ");
			

		
	}

	@Override
	public String LogoutAdmin(String key) throws LogoutException {
		
		
		
	}

	@Override
	public String loginUser(LoginDTO login) throws LoginException {
		
		User user = userRepo.findByMobileNo(login.getMobileNo());
		
		if(user == null) throw new LoginException("No User found with mobileNO : " + login.getMobileNo());
			
		Optional<Current_User_session> opt = userSessionRepo.findById(user.getId());
		
		if(opt.isPresent()) {
			throw new LoginException("User already Logged In with session key : " + opt.get().getUuid());
		}
		
		
		
			if(login.getPassword().equals(user.getPassword())) {
				
				String key = RandomString.make(6);
				
				Current_User_session currSession = new Current_User_session(user.getId(), key, LocalDate.now());
				
				userSessionRepo.save(currSession);
				
				return currSession.toString();
				
			}else
				throw new LoginException(" Wrong password... Try again ");
			

		
	}

	@Override
	public String LogoutUser(String key) throws LogoutException {
		// TODO Auto-generated method stub
		return null;
	}

}
