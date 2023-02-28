package com.week2;

public class Student {
	
	private String name;
	private int rollNumber;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	

	public static void main(String[] args) {
		
		Student aarya = new Student();
		aarya.setName("Aarya");
		aarya.setRollNumber(10);
		System.out.println("Name : "+aarya.getName());
		System.out.println("Roll Number : "+aarya.getRollNumber());

		

	}

}
