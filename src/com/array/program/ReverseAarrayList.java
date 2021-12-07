package com.array.program;

import java.util.ArrayList;

public class ReverseAarrayList {

	static int j;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(56);
		list.add(89);
		list.add(1);
		list.add(50);
		
		/*
		for(int i = 0, j = list.size() - 1; i < j; i++) {
			list.add(i, list.remove(j));
		}*/
		
		
	    int start= 0;
	    int end = list.size()-1;
	    
	    while(start < end) {
	    	list.add(start,list.remove(end));
	    	start++;
	   }
		
		for(Integer l : list) {
			System.out.println(l);
		}
		
	}

}
