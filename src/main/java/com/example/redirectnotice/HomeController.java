package com.example.redirectnotice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Index() {
		return "index";
	}
	
	@GetMapping("/ccd/faces/index.xhtml")
	public String greeting() {
		return "index";
	}

}