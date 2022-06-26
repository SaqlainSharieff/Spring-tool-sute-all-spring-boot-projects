package com.cg.UserOrderManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderDetailsController 
{
	   @Autowired
	   private OrderDetailsService service;
	   
	   // Retrieve All the rows from Database
		@GetMapping("/orders")
		public List<OrderDetails> list()
		{
			return service.listAll();
		}
		
		//Retrieve Specific Records from Database
		
		@GetMapping("/orders/{id}")
		public ResponseEntity<OrderDetails> get (@PathVariable Integer id)
		{
		try 
		
			{
			OrderDetails orderDetails = service.get(id);
				return new ResponseEntity<OrderDetails>(orderDetails, HttpStatus.OK);
			}
		 
		catch (Exception e) 
		{
			return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
			
		}
		}
		
		//CREAT a row in database
		@PostMapping("/orders")
		public void add(@RequestBody OrderDetails orderDetails) 
		{
			service.save(orderDetails);
		}
		
		// Update Operation - record in database
		@PutMapping("/orders/{id}")
		public ResponseEntity<?> update(@RequestBody OrderDetails orderDetails,@PathVariable Integer id)
		{
			try {
				OrderDetails existorderDetails = service.get(id);
				service.save(orderDetails);
				return new ResponseEntity<OrderDetails>(orderDetails, HttpStatus.OK);
			} 
			catch (Exception e) 
			{
			
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		// Delete Operation
		@DeleteMapping("/orders/{id}")
		public void delete(@PathVariable Integer id) 
		{
			service.delete(id);
		}
		
	}
