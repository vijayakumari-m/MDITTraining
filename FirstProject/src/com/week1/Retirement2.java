package com.week1;

import java.util.Scanner;

public class Retirement2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Get contribution and interest rate from user
		System.out.print("How much money will you contribute every year? ");
		double contribution = input.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestrate = input.nextDouble()/100.0d;
		
		//Declare year, readyToRetire and investment
		int year = 1;
		String readyToRetire = "N";
		double investment=contribution;
		
		//Use while loop to check whether readytoretire is "Y" or "N" and iterate until readytoretire is "N"
		while(readyToRetire.equalsIgnoreCase("N")){
			//calculate in the invested amount for the retirement
		     investment +=(contribution * interestrate);
		
			//Print the invested amount
			System.out.println("After year"+ year+", your balance is "+investment);
			System.out.print("Ready to retire? (Y/N) ");
			readyToRetire = input.next();
			
			//Increment the year
			year++;
			investment+=contribution;
			
			
		}
		
		input.close();

	}

}
