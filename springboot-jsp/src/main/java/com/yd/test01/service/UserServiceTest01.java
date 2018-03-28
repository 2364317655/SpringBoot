package com.yd.test01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yd.test01.dao.UserMapperTest01;
import com.yd.test02.dao.UserMapperTest02;
import com.yd.test02.service.UserServiceTest02;

@Service
public class UserServiceTest01 {
	
	@Autowired
	private UserMapperTest01 userMapperTest01;
	@Autowired
	private UserMapperTest02 userMapperTest02;
	//private UserServiceTest02 userServiceTest02;
	/**
	 * @Transactional 事物注解配置
	 * @param name
	 * @param sex
	 * @return
	 */
	@Transactional
	public String insert001(String name,Integer sex){
		userMapperTest01.insert(name, sex);
		userMapperTest02.insert(name, sex);
		//userServiceTest02.insert002(name, sex);
		int i=1/0;
		return "SUCCESS";
	}
	
}
