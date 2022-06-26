package com.example.zip.details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {

	@Autowired
	private DetailsService detailsService;
	
	@RequestMapping("/details")
	public List<Details> getDetails(){
		return detailsService.getDetails();
	}
	
	@RequestMapping("/details/{zip}")
	public Details getZipCodeDetails(@PathVariable Integer zip) {
		return detailsService.getZipCodeDetails(zip);
	}
}
