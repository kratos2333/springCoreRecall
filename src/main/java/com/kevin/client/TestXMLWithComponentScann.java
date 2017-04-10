package com.kevin.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kevin.componentscan.Student;
import com.kevin.componentscan.Teacher;

public class TestXMLWithComponentScann {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextWithComponentScan.xml");
		
		Student student1 = context.getBean("student", Student.class);
		student1.speak();
		student1.expressMood();
		
		System.out.println("Student is : " + student1.getFirstName() + " " + student1.getLastName());
		
		System.out.println("-----------------------------------");
		
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		teacher1.speak();
		teacher1.expressMood();
		
		System.out.println("Teacher is : " + teacher1.getFirstName() + " " + teacher1.getLastName());
		
		System.out.println("-----------------------------------");
		// Student's scope is prototype, so every time the context call getBean will create a new instance
		Student student2 = context.getBean("student", Student.class);
		System.out.println("Are student1 and studnet2 same instance ? " + (student1 == student2));
		
		// Teacher's scope is singleton which is the default scope, every time call getBean will return the same instance
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		System.out.println("Are teacher1 and teacher2 same instance ? " + (teacher1 == teacher2));
		
		// Close the application context
		context.close();
	}

}
