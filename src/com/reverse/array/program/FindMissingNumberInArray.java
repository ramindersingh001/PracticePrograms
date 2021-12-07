package com.reverse.array.program;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,7};
		
		int arrayElementSum = 0,totalExpectedSum=0;;
		
		for(int i=0;i<array.length;i++) {
			arrayElementSum +=array[i];
		}
		
		for(int i=1;i<=array[array.length-1];i++) {
			totalExpectedSum+= i;
		}
		
		
		System.out.println("Missing number is : "+ (totalExpectedSum-arrayElementSum));

	}

}
