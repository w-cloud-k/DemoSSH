package com.wyk.sh4.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {

	@RequestMapping("/helloWorld")
	public String helloWorld(){
		
		return "helloworld";
	}
	
}
