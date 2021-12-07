package com.sorting.algorithms.examples;

public class BubbleSort {

	public static void main(String[] args) {
		
        /*If boolean swap  flag not used then the order of execution will be O(n^2). So to optimize 
         * this swap flag is used to break the loop flow if no swapping happened.
         * */
		
		
		int[] arr = {12,1,48,4,6};
		boolean swap =false;
		System.out.println("Sorting an array : Bubble Sort :--> Length of array is : "+ arr.length);
		
		for(int i=0; i < arr.length-1 ; i++) {
			
			for(int j=0 ; j < arr.length-i-1 ; j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
					
				}	
				
				if(swap == false) {
					break;
				}
			}
			
		}
		
		
		System.out.println("Array After Sorting : " + arr.length);
		
		for(int a : arr) {
			System.out.print( ": " + a );
		}
		

	}

}
