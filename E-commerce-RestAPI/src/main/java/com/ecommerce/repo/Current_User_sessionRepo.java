package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Current_User_session;

public interface Current_User_sessionRepo extends JpaRepository<Current_User_session, Integer> {

	public Current_User_session findByuuid(String uuid);
}
