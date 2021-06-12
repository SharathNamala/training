package com.app.RealEstateApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstateController {

	@RequestMapping("/home")
	public String home() {

		return "home";
	}
	
	@RequestMapping("/searchbyid")
	public String getbyid() {

		return "getbyid";
	}
	
	@RequestMapping("/searchbycity")
	public String getbycity() {

		return "getbycity";
	}
}
