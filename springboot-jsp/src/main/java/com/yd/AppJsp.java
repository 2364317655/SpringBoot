package com.yd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication 作用：启动项目，整合常用注解，扫包作用（只能在当前同级包下）
 * 					 @ComponentScan+@EnableAutoConfiguration+@Configuration
 * @Description:
 * @author:Sandy
 * @Date:2018年3月28日 下午3:29:47
 */
@SpringBootApplication
//@ComponentScan("com.yd.controller")
@MapperScan(basePackages={"com.yd.mapper"})
//@EnableAutoConfiguration
public class AppJsp {
	
	public static void main(String[] args) {
		SpringApplication.run(AppJsp.class, args);
	}
	
}
