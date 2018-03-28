package com.yd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yd.dao.UserDao;
import com.yd.entity.User;
import com.yd.service.UserService;
/**
 * user 数据库处理方法
 * @Description:
 * @author:Sandy
 * @Date:2018年3月28日 下午2:16:48
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/createUser")
	public String index(String name,Integer sex){
		userService.createUser(name, sex);
		return "success";
	}
	
	@RequestMapping("/getUser")
	public User getUser(Long id){
		return userDao.findById(id).get();
	}
}
