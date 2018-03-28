package com.yd.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//表示该接口全部返回json格式
@RestController
@RequestMapping
public class HelloWordController {
	
	@RequestMapping("/index")
	public String index(){
		return "success";
	}
	
	@RequestMapping("/getMap")
	public Map<String,Object> getMap(){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("errorCode", 200);
		map.put("errorMsg", "成功...");
		return map;
	}
	
	/*public static void main(String[] args) {
		//主函数运行springboot项目
		SpringApplication.run(HelloWordController.class, args);
	}*/
}
