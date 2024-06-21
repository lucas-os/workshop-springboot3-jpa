package com.los.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.los.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	
}
