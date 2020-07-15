package com.example.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_security.domain.User;

public interface UserRepository extends JpaRepository<User,Integer>{

	org.springframework.security.core.userdetails.User findByUserName(String username);

}
