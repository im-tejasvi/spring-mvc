package com.app.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	// create request mapping for showing form
	@RequestMapping("/showForm")
	public String showForm() {
		return "silly";
	}
}
