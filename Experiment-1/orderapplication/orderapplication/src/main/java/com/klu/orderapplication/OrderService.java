package com.klu.orderapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository or;
	
	public String insert(Order o)
	{
		or.save(o);
		return "Order Placed Successfully";
	}
	
	public List<Order> retrieve()
	{
		return or.findAll();
	}
}
