package com.week1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Get minimun range, maximum range and number of bets from user
		System.out.println("Enter the minimum range: ");
		int minRange = input.nextInt();
		System.out.println("Enter the maximum range: ");
		int maxRange = input.nextInt();
		System.out.println("Enter number of bets: ");
		int bets = input.nextInt();
		
		//Declare an integer array
		int[] randomNumbers = new int[bets];
		
		//create instance for Random class
		Random randomDraw = new Random();
		
		// Using for loop iterate the loop to generate random numbers
		for(int i=0;i<bets;i++) {
			randomNumbers[i] = randomDraw.nextInt(minRange, maxRange);
			
		}
		
		//Sort the array
		Arrays.sort(randomNumbers);
		
		//Print the random numbers using enhanced for loop
		System.out.println("Bet the following combination. It'll make you rich!");
		for(int rn : randomNumbers) {
			System.out.println(rn);
		}
		input.close();

	}

}
