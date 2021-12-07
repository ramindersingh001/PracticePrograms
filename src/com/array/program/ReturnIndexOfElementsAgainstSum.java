package com.array.program;

import java.util.ArrayList;

public class ReturnIndexOfElementsAgainstSum {

	public static void main(String[] args) {
		
		int[] array = {3,2,4,1,6};                  //1,2,2,3,4,6
		
		int sum=15;
		
		ArrayList<Integer>  list = returnIndex(array, sum);
		
		System.out.println(list);

	}
	
	public static ArrayList<Integer> returnIndex(int[] array,int sum) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int total=0;
		
		for(int i=0;i<array.length;i++) {
		
			if(array[i] == sum) {
				list.clear();
				list.add(i);
				break;
			}
			else if(sum != total) {
				total+=array[i];
				if(sum < total) {
					total-=array[i];
				}
				else
				list.add(i);
			}
		}
		return list;
	}
}
