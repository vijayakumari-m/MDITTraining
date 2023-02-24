package com.week1;

import java.util.Scanner;

public class Savings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Get requiredAmount,investmentAmount and interestRate from user
		System.out.println("How much money do you need to retire? ");
		double requiredAmount = input.nextDouble();
		
		
		System.out.println("How much money will you contribute every year? ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Interest rate in %: ");
		double interestRate =input.nextDouble()/100.0d;
		
		double acumlativeAmount=investmentAmount;
		int year= 0;
		
		//while loop to calculate the acumlative amount and increase the year
		while(requiredAmount > acumlativeAmount) {
			
			acumlativeAmount += (acumlativeAmount*interestRate);
			year++;
			
			acumlativeAmount +=investmentAmount;
			//System.out.println(acumlativeAmount);
		}
		//Print 
		System.out.println("You can retire in "+year+" years");

	}

}
