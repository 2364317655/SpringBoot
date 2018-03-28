package com.yd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yd.entity.User;

public interface UserDao extends JpaRepository<User, Long>{

}
