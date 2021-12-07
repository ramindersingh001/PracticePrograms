package com.array.program;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] array = {1,3,5,7};
		
		int[] array1 = {2,4,6,8};          //         12345678 --> 
		
		
		int[] arr = mergeTwoArray(array, array1);
		
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		

	}
	
	
	public static int[] mergeTwoArray(int[] array, int[] array1) {
		
		int[] temp = new int[array.length+array1.length];
	
		int i = 0, j = 0, k = 0;
		
		while (i<array.length && j <array1.length)
        {
            if (array[i] < array1[j])
            	temp[k++] = array[i++];
            else
            	temp[k++] = array1[j++];
        }
		
		while (i < array.length)
			temp[k++] = array[i++];
     
        while (j < array1.length)
            temp[k++] = array1[j++];
		
		return temp;
	}

}
