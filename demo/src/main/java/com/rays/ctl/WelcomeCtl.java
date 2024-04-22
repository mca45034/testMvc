package com.rays.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "welcome")
public class WelcomeCtl {
	@GetMapping
	public String disp() {
		return "Welcome";
	}

}
