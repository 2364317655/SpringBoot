/*package com.yd.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration //注册到springboot容器中
@MapperScan(basePackages="com.yd.test01",sqlSessionFactoryRef="test1SqlSessionFactory")
public class DataSource1Config {
	
	
	
	*//**
	 * 配置test1数据库
	 * @return
	 *//*
	@Bean(name="test1DataSource")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.test1")
	public DataSource testDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	*//**
	 * test1 sql会话工厂
	 * @param dataSource
	 * @return
	 * @throws Exception
	 *//*
	@Bean(name="test1SqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource")DataSource dataSource) throws Exception{
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		//mybatis 写配置文件
		//bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
		return bean.getObject();
	}
	
	*//**
	 * test1事物管理
	 * @param dataSource
	 * @return
	 *//*
	@Bean(name="test1TransavtionManager")
	@Primary
	public DataSourceTransactionManager testTransavtionManager(@Qualifier("test1DataSource")DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean(name="test1SqlSessionTemplate")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("test1SqlSessionFactory")SqlSessionFactory sqlSessionFactory){
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
}
*/