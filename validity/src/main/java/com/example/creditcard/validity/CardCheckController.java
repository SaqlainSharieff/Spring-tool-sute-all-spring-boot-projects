package com.example.creditcard.validity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardCheckController {
	
	@Autowired
	private CardService cardService;

	@RequestMapping("/Card/{num}")
	public String getValidity(@PathVariable Long num) {
		return cardService.getValidity(num);
	}
}
