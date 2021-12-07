package com.array.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CheckPossibleFormedDigitsInArray {

	public static void main(String[] args) {
		
		int[] array = {34,79,58,64};
		
		int size = array.length;
		
		ArrayList<Integer> list = checkMaximumNumberThatCanBeFormed(array, size);
		
		String formed ="";
		
		for(Integer l : list) {
			formed+=String.valueOf(l);
		}
		
		System.out.println(formed);
	}

	
	
	public static ArrayList<Integer> checkMaximumNumberThatCanBeFormed(int[] a,int size) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<size;i++) {
			
			while(a[i] !=0) {
				
				int num = a[i] % 10 ;
				
				a[i] = a[i] /10;
				
				list.add(num);
				
			}
		}
		
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
		});
		return list;
	}
}














