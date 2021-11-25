package com.app.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// create request mapping for showing form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// create request mapping for showing form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// create new request mapping for setting data in model
	@RequestMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();

		String messageName = "Hello! " + name;
		model.addAttribute("message", messageName);

		return "helloworld";
	}

	// create new request mapping for setting data in model
	@RequestMapping("/processFormV3")
	public String processFormV2(@RequestParam("studentName") String name, Model model) {
		name = name.toUpperCase();

		String messageName = "Hello from v3! " + name;
		model.addAttribute("message", messageName);

		return "helloworld";
	}
}
