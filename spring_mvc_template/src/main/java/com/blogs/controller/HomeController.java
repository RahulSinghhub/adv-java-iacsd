package com.blogs.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("in ");
	}
	@PostConstruct
	public void init() {
		System.out.println("start the constructor "+getClass());
		
	}
	@RequestMapping("/")
	public String  testMe() {
		System.out.println("test me hi");
		return "/index";
	}
}
