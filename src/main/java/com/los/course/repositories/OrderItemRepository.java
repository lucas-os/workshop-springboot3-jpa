package com.los.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.los.course.entities.OrderItem;
import com.los.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> 
{
	
}
