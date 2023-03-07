package com.week3;

import java.util.*;

public class TreeMapIteration {

	public static void main(String[] args) {


		Map<String,Integer> temperature = new TreeMap<>();
		temperature.put("Chennai", 35);
		temperature.put("Bangalore", 30);
		temperature.put("Mumbai", 25);
		temperature.put("Delhi", 31);
		temperature.put("Kolkata", 36);
		
		for(Map.Entry<String, Integer> entry:temperature.entrySet()){
			
			System.out.println(entry.getKey()+" - "+entry.getValue());
			
		}

	}

}
