package com.week2;


////Week 2 - Program 6 Main method
public class AdditionMain {

	public static void main(String[] args) {
		
		
		Addition sum = new Addition();
		int sumOfTwoNumbers = sum.add(25, 32); 
		int sumOfThreeNumbers = sum.add(56, 73, 48) ;
		System.out.println("The Sum of 2 Numbers : "+sumOfTwoNumbers);
		System.out.println("The Sum of 3 Numbers : "+sumOfThreeNumbers);
		
	}

}
