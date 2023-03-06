package com.week2;


//Week 2 - Program 2's main method
public class MainClassCat {
	
	//Create main()
	public static void main(String[] args) {
		
		//Create instance for Cat class
		Cat brownie = new Cat(50,50,50);
		
		//Invoke all the methods
		brownie.sleep();
		brownie.play();
		brownie.eat();
		brownie.digest();
		
		//Print the values
		System.out.println("Energy : "+brownie.getEnergyIndex());
		System.out.println("Mood : "+brownie.getMoodIndex());
		System.out.println("Hunger : "+brownie.getHungerIndex());

		}

}
