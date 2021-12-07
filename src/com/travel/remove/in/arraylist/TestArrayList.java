package com.travel.remove.in.arraylist;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
        list.add("RA");
        list.add("AA");
        list.add("SS");
        list.add("FF");
        
        printList(list);
        
        Iterator<String> itr = list.iterator();
        
		while (itr.hasNext()) {

			String value = itr.next();

			if (value.equalsIgnoreCase("SS")) {
				itr.remove();
			}

		}
		
		System.out.println("=================================");
		printList(list);
        
		 
	}
	
	public static void printList(List<String> list) {

		for (String s : list) {
			System.out.println(s);
		}

	}

}
