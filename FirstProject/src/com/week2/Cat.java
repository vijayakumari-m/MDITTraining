package com.week2;

//Week 2 - Program 1
 class Cat {
	 
	 //Declare moodIndex, hungerIndex & energyIndex with value 50
	private int moodIndex;
	private int hungerIndex;
	private int energyIndex;
	
	public Cat(int moodIndex, int hungerIndex, int energyIndex) {
		this.moodIndex = moodIndex;
		this.hungerIndex = hungerIndex;
		this.energyIndex = energyIndex;
	}
	
	public int getMoodIndex() {
		return moodIndex;
	}

	public int getHungerIndex() {
		return hungerIndex;
	}

	public int getEnergyIndex() {
		return energyIndex;
	}

	
	
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



