package org.dnyanyog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolMain {
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student std = spring.getBean(Student.class);
		
		std.setFirstName("Shreyash");
		std.setLastName("Sutar");
		std.setBranchName("Computer");
		std.setAge(21);
		std.setMobile("8485898732");
		
		std.getAddress().setStreet1("Shastri chowk Street");
		std.getAddress().setStreet2("Aalandi Road");
		std.getAddress().setCity("Bhosari");;
		std.getAddress().setCity("Pune");
		std.getAddress().setState("Maharashtra");
		std.getAddress().setCountry("INDIA");
		
		System.out.println(std);

		
		
	}

}
