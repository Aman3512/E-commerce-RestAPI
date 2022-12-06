package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
	
	public Admin findByMobileNo(Long mobileNo);

}
