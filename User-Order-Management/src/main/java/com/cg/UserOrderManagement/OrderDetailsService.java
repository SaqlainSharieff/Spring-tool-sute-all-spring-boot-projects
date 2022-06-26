package com.cg.UserOrderManagement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class OrderDetailsService 
{
	 @Autowired
	 private OrderDetailsRepository repository;
		public List<OrderDetails > listAll() 
		{
			
			return repository.findAll();
		}
		public OrderDetails  get(Integer id) 
		{
		
			return repository.findById(id).get();
		}
		public void save(OrderDetails  orderDetails ) 
		{
			
			 repository.save(orderDetails );
		}
		public void delete(Integer id) 
		{
			repository.deleteById(id);
			
		}

	}
