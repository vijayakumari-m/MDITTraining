package com.week1;

public class Investment {

	public static void main(String[] args) {
		
		double investamount = 10000.00;
		//Declare single dimension array to store the various interest rates
		double[] interestRate = {0.10,0.11,0.12,0.13,0.14,0.15};
		//Declare 2D array to store the growth of the investment amount every year 
		double[][] growth = new double[10][6];
		//for loop to print the interest rate as header of the table
		for(int i=10;i<16;i++) {
			System.out.print(i+"%        ");
			
		}
		
		System.out.println();
		//nested for loop to calculate the growth of the invested amount 
		for(int i=0;i<10;i++) {
			for(int j=0;j<6;j++) {
				
			   if (i==0) {
				   //store initial investment amount in 0th row of the table
					growth[i][j] = investamount;
				}
				else {
					//calculate interest rate and reinvested every year
					growth[i][j] = (double)(growth[i-1][j] + (double)(growth[i-1][j]*interestRate[j]));
				}
			   //print the value in tabular form with 2 decimals
			   System.out.print(String.format("%.2f", growth[i][j]) + "   ");
			}
			System.out.println();
			
		}
		
	}

}
