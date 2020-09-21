package com.ansul.thakur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean("stud", Student.class);
		s.displayStudentInfo();
		Student s2 = context.getBean("stud2", Student.class);
		s2.displayStudentInfo();
		
	}

}
