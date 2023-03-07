package com.week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		
		Map<Integer,String> attendance = new HashMap<>();
		attendance.put(501, "Aadhya");
		attendance.put(502, "Abhi");
		attendance.put(503, "Chinnu");
		attendance.put(504, "Elena");
		attendance.put(505, "Jammy");
		
		Iterator<Integer> it =attendance.keySet().iterator();
		while(it.hasNext()) {
			
			int key = it.next();
			System.out.println(key +" , "+attendance.get(key));
		}

	}

}
