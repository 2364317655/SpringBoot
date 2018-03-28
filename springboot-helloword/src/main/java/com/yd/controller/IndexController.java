package com.yd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping("/index1")
	public String index(){
		int i=1/0;
		return "index";
	}
	
}
