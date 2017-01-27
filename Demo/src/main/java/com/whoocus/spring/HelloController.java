package com.whoocus.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model modle){
		modle.addAttribute("hello", "こんにちは。たぢさん。");
		return "hello";
	}
}
