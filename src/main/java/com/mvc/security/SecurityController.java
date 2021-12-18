package com.mvc.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	@GetMapping(path = "/notAuthorized")
	public String error() {
		return "notAuthorized";
	}
}
