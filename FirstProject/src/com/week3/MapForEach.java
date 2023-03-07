package com.week3;

import java.util.*;

public class MapForEach {

	public static void main(String[] args) {
		
		
		Map<String,String> currency = new HashMap<>();
		currency.put("INR", "Indian Rupee");
		currency.put("USD", "US Dollar");
		currency.put("AUD", "Australian Dollar");
		currency.put("EGP", "Egyptian Pound");
		currency.put("EUR", "Euro");
		currency.put("GBP", "Pound Sterling");
		
		for(Map.Entry<String, String> entry : currency.entrySet()) {
			
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		

	}

}
