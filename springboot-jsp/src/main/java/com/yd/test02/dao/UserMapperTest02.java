package com.yd.test02.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.yd.entity.User;

public interface UserMapperTest02 {
	
	@Select("SELECT * FROM `users` where name=#{name}")
	User findByName(@Param("name")String name);
	
	@Insert("insert into users(name,sex) values(#{name},#{sex})")
	int insert(@Param("name")String name,@Param("sex")Integer sex);
	
}
