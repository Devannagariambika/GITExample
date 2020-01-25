package com.xworkz.datasource.spring;

import java.sql.Connection;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTester {

	public static void main(String[] args) {
		try{
		Connection connection=null;
		Statement statement=null;
		String sql="insert into dataresource_table values(3,'car',100000)";
	ApplicationContext container=new ClassPathXmlApplicationContext("resource/spring.xml");
	DataSource dataSource=container.getBean(DataSource.class);
	System.out.println(dataSource);
	 connection=dataSource.getConnection();
	 statement=connection.createStatement();
	 
	statement.execute(sql);
	System.out.println("Updated done");
	}
	catch (Exception e) {
		System.err.println("Handle in Main Exception "+e.getMessage());
	}
	
	
}
	}

