package com.springcore.javaconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
	    
		Student st= (Student) con.getBean("st");
		st.study();
		
	
	}
}
