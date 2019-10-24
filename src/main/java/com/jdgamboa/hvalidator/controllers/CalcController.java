package com.jdgamboa.hvalidator.controllers;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdgamboa.hvalidator.models.Calculus;

@Controller
public class CalcController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/calculate")
	public String showForm(Model model) {
		model.addAttribute("calc", new Calculus());
		return "calculate";
	}
	
	@RequestMapping("/result")
	public String processForm(
			@Valid @ModelAttribute("calc") Calculus calc,
			BindingResult bindingResult,
			Model model) {
		System.out.println("Binding result: " + bindingResult);
		if (bindingResult.hasErrors()) {
			return "calculate";
		} else {
			int result = 0;
			for (int i = 0; i <= calc.getLimit(); i+=2) {
				result += i;
			}
			model.addAttribute("result", result);
			Date calcDate = new Date();
			model.addAttribute("date", calcDate);
			return "result";
		}
	}
	
}
