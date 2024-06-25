package com.los.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.los.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> 
{
	
}
