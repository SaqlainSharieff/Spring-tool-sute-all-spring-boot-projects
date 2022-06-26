package com.cg.CustomerDetails;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CustomerService 
{
	 @Autowired
	 private CustomerRepository repository;
		public List<Customer > listAll() 
		{
			
			return (List<Customer>) repository.findAll();
		}
		public Customer  get(Integer id) 
		{
		
			return repository.findById(id).get();
		}
		public void save(Customer  customer ) 
		{
			
			 repository.save(customer);
		}
		public void delete(Integer id) 
		{
			repository.deleteById(id);
			
		}

	}

