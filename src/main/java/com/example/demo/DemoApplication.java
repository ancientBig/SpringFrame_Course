package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import Entity.CustomDAO;
import Entity.CustomerCLS;



@SpringBootApplication
public class DemoApplication {

	
	@Autowired
	static JdbcTemplate jdbcTemplate;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		try
		{
			ApplicationContext context = new FileSystemXmlApplicationContext("AppContext.xml");
			CustomDAO customerFUNC = (CustomDAO) context.getBean("CustomerDAOZ");
			            CustomerCLS dbCustomer = new CustomerCLS("sunshine", "dawn", "33 str, mabong", "92839283938239", "22222", "tail@tall");
			           // customerFUNC.insert(dbCustomer);
			            CustomerCLS findCustomer = customerFUNC.findById(13);
			            System.out.println(findCustomer); 
			           // context.close();
			            
			            

   
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
   
	}
}
