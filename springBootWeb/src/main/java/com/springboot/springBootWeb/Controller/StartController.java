package com.springboot.springBootWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StartController {
	
	@RequestMapping("/")//Base URL :: http://localhost:8082/springBootWeb/
	@ResponseBody
	public String index() {
		return "<h1>Welcome Spring Boot Web</h1>";
	}

	@RequestMapping("/welcome") //URL with Parameters :: http://localhost:8082/springBootWeb/welcome?userName=MohammadFawad
	@ResponseBody
	public String userIdentity(@RequestParam String userName) {
		return "<h5>Welcome " + userName + "</h5>";
	}
}
