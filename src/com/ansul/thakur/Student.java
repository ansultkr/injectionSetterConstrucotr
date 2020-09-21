package com.ansul.thakur;

public class Student {
	private int id;
	private String studentName;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter Method called for studentName");
	}

	public void displayStudentInfo() {
		System.out.println("Student Name is : "+ studentName+" and the id is: "+id);
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Setter Method called for ID");
	}
}
