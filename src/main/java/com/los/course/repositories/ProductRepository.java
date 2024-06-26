package com.los.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.los.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> 
{
	
}
