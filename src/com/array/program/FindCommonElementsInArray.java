package com.array.program;

public class FindCommonElementsInArray {

	public static void main(String[] args) {
	
		
		int[] array = {1,2,3,5,4};
		int[] array1 ={1,2,3,4,5};
		
		System.out.println(array1.length-1);
		
		for (int i = 0; i < array.length; i++) {

			//System.out.println("array[i] value : " + array[i]);
			for (int j = 0; j < array1.length; j++) {

				if (array[i] == array[j]) {
					System.out.println("Common element is : " + array[i]);
					break;
				}
			}

		}

	}

}
