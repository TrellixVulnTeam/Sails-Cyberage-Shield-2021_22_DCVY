package com.sailssoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sailssoft.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmailId(String email);

	public User findByUsername(String username);

	public User findByResetPasswordToken(String token);
	
	
}
