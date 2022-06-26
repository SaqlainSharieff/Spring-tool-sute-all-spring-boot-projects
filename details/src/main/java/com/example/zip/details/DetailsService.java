package com.example.zip.details;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DetailsService {

	List<Details> list=new ArrayList<Details>(Arrays.asList(
			new Details("Punjab","Chandigarh","India",1),
			new Details("UP","Lucknow","India",2),
			new Details("MP","Indore","India",3),
			new Details("Jharkhand","Ranchi","India",4)));
	
	

	@Override
	public String toString() {
		return "DetailsService [list=" + list + "]";
	}



	public List<Details> getDetails() {
		
		return list;
	}



	public Details getZipCodeDetails(Integer zip) {
		Details details=(Details) list.stream().filter(d->d.getZipcode().equals(zip)).findFirst().get();
		return details;
	} 
}
