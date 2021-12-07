package com.reverse.array.program;

public class ReverseArrayProgram {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
        int start=0, end = array.length-1;
		
        System.out.println("Before reversing an array ::-");
        printArray(array);
        
        
		while(start < end) {
			
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println("=========================");
		System.out.println("After reversing an array ::-");
	    printArray(array);
		
	}
	
	
	public static void printArray(int[] array) {
		for(Integer a : array) {
			System.out.println(a);
		}
	}

}
