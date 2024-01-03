package com.winter.app.countries;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/countries/*")

public class CountriesController {
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String countriseList() {
		System.out.println("Countrise List");
		return "countrise/list";
	}

}
