package com.yd.datasource;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jta.atomikos.AtomikosConnectionFactoryBean;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;

@Configuration
//basePackages 最好分开配置 如果放在同一个文件夹可能会报错
@MapperScan(basePackages="com.yd.test01",sqlSessionFactoryRef="test1SqlSessionFactory")
public class TestMyBatisConfig1 {
	
	/**
	 * 配置test1数据库
	 * @return
	 */
	@Bean(name="test1DataSource")
	@Primary
	public DataSource testDataSource(DBConfig1 testConfig){
		MysqlXADataSource mysqlXADataSource=new MysqlXADataSource();
		mysqlXADataSource.setUrl(testConfig.getUrl());
		mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
		mysqlXADataSource.setPassword(testConfig.getPassword());
		mysqlXADataSource.setUser(testConfig.getUsername());
		mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);
		
		AtomikosDataSourceBean xaDataSource=new AtomikosDataSourceBean();
		return DataSourceBuilder.create().build();
	}
	
}
