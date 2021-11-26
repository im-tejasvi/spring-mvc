package com.app.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// Add an initBinder to trim white spaces
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
