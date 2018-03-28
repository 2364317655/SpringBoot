package com.yd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yd.entity.User;
import com.yd.mapper.UserMapper;
import com.yd.test01.dao.UserMapperTest01;
import com.yd.test01.service.UserServiceTest01;
import com.yd.test02.dao.UserMapperTest02;

@Controller
public class IndexCotroller {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserMapperTest01 userMapperTest01;
	@Autowired
	private UserMapperTest02 userMapperTest02;
	@Autowired
	private UserServiceTest01 userServiceTest01;
	
	
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
	
	
	@RequestMapping("/insertTest001")
	@ResponseBody
	public String insertTest001(String name,Integer sex){
		//return userMapperTest01.insert(name, sex);
		return userServiceTest01.insert001(name, sex);
	}
	
	@RequestMapping("/insertTest002")
	@ResponseBody
	public Integer insertTest002(String name,Integer sex){
		return userMapperTest02.insert(name, sex);
	}
}
