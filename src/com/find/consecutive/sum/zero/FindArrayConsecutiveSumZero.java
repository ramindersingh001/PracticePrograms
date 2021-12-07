package com.find.consecutive.sum.zero;

import java.util.HashSet;

import java.util.Set;

public class FindArrayConsecutiveSumZero {

	public static void main(String[] args) {
		
		
		int[] array ={6,-2,3,-1};
		
		System.out.println(subArrayExists(array));

	}
	
   public static boolean subArrayExists(int arr[])
	    {
	        Set<Integer> hs = new HashSet<Integer>();
	 
	        int sum = 0;
	 
	        for (int i = 0; i < arr.length; i++)
	        {
	        	sum += arr[i];
	        	
	            if (hs.contains(sum)) {
	            
	                return true;
	            }
	            hs.add(sum);
	        }
	       
	       return false;
	    }
}
