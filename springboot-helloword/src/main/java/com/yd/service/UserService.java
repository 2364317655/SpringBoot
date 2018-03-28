package com.yd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.yd.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private UserDao userDao;
	/**
	 * 新增数据
	 * @param name
	 * @param sex
	 */
	public void createUser(String name,Integer sex){
		jdbcTemplate.update("insert into users values(null,?,?)",name,sex);
	}
	
	/**
	 * 删除数据
	 */
	public void deleteUser(){
		
	}
	
	public void createUserJpa(){
		//userDao.save(arg0);
	}
	
	
}
