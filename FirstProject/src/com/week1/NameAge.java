package com.week1;
import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//Get name and age as input from user
		System.out.print("What is your name?");
		String name = input.next();
		System.out.print("How old are you?");
		int age = input.nextInt();
		//Increment age by 1
		age=age+1;
		System.out.println("Hello, "+name+". Next year, you'll be "+age);
		input.close();
		

	}

}
