package com.yd.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yd.test02.dao.UserMapperTest02;

@Service
public class UserServiceTest02 {
	
	@Autowired
	private UserMapperTest02 userMapperTest02;
	/**
	 * @Transactional 事物注解配置
	 * @param name
	 * @param sex
	 * @return
	 */
	@Transactional
	public String insert002(String name,Integer sex){
		userMapperTest02.insert(name, sex);
		int i=1/0;
		return "SUCCESS";
	}
	
}
