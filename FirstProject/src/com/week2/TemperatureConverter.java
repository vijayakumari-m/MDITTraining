package com.week2;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option = 0;
		double celcius;
		double fahrenheit;
		double kelvin;
		
		System.out.println("1. Celcius to Fahrenheit");
		System.out.println("2. Celcius to Kelvin");
		System.out.println("3. Fahrenheit to Celcius");
		System.out.println("4. Fahrenheit to Kelvin");
		System.out.println("5. Kelvin to Celcius");
		System.out.println("6. Kelvin to Fahrenheit");
		System.out.println("7. Exit");
		System.out.println();

		while (option < 7) {

			
			System.out.print("Enter Choice: ");
			option = input.nextInt();

			switch (option) {

				// 1. Celcius to Fahrenheit
				case 1: {

					System.out.print("Enter Celcius value:");
					celcius = input.nextDouble();
					fahrenheit = (celcius * 1.8) + 32;
					System.out.println("Fahrenheit value: " + fahrenheit);
					break;
				}

				// 2. Celcius to Kelvin
				case 2: {

					System.out.print("Enter Celcius value:");
					celcius = input.nextDouble();
					kelvin = celcius + 273.15;
					System.out.println("Kelvin value: " + kelvin);
					break;
				}

				// 3. Fahrenheit to Celcius
				case 3: {

					System.out.print("Enter Fahrenheit value:");
					fahrenheit = input.nextDouble();
					celcius = (fahrenheit - 32) * (5 / 9);
					System.out.println("Celcius value: " + celcius);
					break;
				}

				// 4. Fahrenheit to Kelvin
				case 4: {

					System.out.print("Enter Fahrenheit value:");
					fahrenheit = input.nextDouble();
					kelvin = (fahrenheit - 32) * (5 / 9) + 273.15;
					System.out.println("Celcius value: " + kelvin);
					break;
				}

				// 5. Kelvin to Celcius
				case 5: {

					System.out.print("Enter Kelvin value:");
					kelvin = input.nextDouble();
					celcius = kelvin - 273.15;
					System.out.println("Celcius value: " + celcius);
					break;

				}

				// 6. Kelvin to Fahrenheit
				case 6: {

					System.out.print("Enter Kelvin value:");
					kelvin = input.nextDouble();
					fahrenheit = (kelvin - 273.15) * (9 / 5) + 32;
					System.out.println("Celcius value: " + fahrenheit);
					break;

				}

				// 7. Exit
				case 7: {

					System.out.print("Program Terminated");
					break;

				}

			}
		} 

	}

}
