package com.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		List<String> colours = new ArrayList<>();
		
		colours.add("Voilet");
		colours.add("Indigo");
		colours.add("Blue");
		colours.add("Green");
		colours.add("Yellow");
		colours.add("Orange");
		colours.add("Red");
		
		System.out.println("Before Reversing");
		System.out.println(colours);
		
		Collections.reverse(colours);
		System.out.println("After Reversing");
		System.out.println(colours);

	}

}
