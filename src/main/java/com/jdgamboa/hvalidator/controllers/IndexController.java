package com.jdgamboa.hvalidator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String showPage() {
		return "index";
	}
	
}
