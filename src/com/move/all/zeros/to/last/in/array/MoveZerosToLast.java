package com.move.all.zeros.to.last.in.array;

public class MoveZerosToLast {

	public static void main(String[] args) {
	
		int a[]  = {7,45,0,4,8,0,1,2,0,5};
		
		a =moveZeros(a);
		
		for(Integer j : a) {
			System.out.println(j);
		}
	}
	
	
	public static int[] moveZeros(int[] array) {
		
		int[] temp = new int[array.length];
		
		int j=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]!=0) {
				temp[j++] =array[i];
			}
		}
		
		while(j < temp.length) {
			temp[j++] = 0;
		}
	
		return temp;
	}

}
