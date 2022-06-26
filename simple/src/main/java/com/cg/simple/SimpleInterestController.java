package com.cg.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleInterestController {

	@RequestMapping(value="/interest")
	public String getInterest() {
		return "index";
	}
}
