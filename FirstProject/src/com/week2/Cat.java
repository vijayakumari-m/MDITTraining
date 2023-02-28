package com.week2;

//Week 2 - Program 1
 public class Cat {
	 
	 //Declare moodIndex, hungerIndex & energyIndex with value 50
	int moodIndex = 50;
	int hungerIndex = 50;
	int energyIndex =50;
	
	//Define an action sleep() and Increase energyIndex by 10
	public void sleep() {
		
		energyIndex += 10; 
		
	}
	
	//Define an action play() and Increase moodIndex by 10, hungerIndex by 5 and reduce energyIndex by 20
	public void play() {
		
		moodIndex += 10;
		hungerIndex += 5;
		energyIndex -= 20; 
	}
	
	//Define an action eat() and Increase energyIndex by 20
	public void eat() {
		
		energyIndex += 20; 
	}
	
	//Define an action sleep() and Increase moodIndex by 5
	public void digest() {
		
		moodIndex += 5;
	}

}



