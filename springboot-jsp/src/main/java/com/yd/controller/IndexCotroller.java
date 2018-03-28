package com.yd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCotroller {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	
}
