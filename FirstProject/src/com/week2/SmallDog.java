package com.week2;

public class SmallDog extends Dog{
	
	public void eat() {
		System.out.println("The Dog can eat ");
	}

	public static void main(String[] args) {


		SmallDog jimmy = new SmallDog();
		jimmy.bark();
		jimmy.eat();

	}

}
