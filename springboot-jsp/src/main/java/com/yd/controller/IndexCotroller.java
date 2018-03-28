package com.yd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yd.entity.User;
import com.yd.mapper.UserMapper;

@Controller
public class IndexCotroller {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/findByName")
	@ResponseBody
	public User findByName(String name){
		return userMapper.findByName(name);
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public Integer insert(String name,Integer sex){
		return userMapper.insert(name, sex);
	}
	
}
