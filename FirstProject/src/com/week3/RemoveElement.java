package com.week3;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {

		//Create instance for ArrayList class
		List<String> schoolbag = new ArrayList<>();
		
		//Add elements to the arraylist
		schoolbag.add("books");
		schoolbag.add("notebook");
		schoolbag.add("pencilbox");
		schoolbag.add("pen");
		schoolbag.add("eraser");
		
		System.out.println("Before Removing an element");
		System.out.println(schoolbag);
		System.out.println("After Removing an element");
		//Remove an element on specified index
		schoolbag.remove(3);
		System.out.println(schoolbag);
	}
	
	

}
