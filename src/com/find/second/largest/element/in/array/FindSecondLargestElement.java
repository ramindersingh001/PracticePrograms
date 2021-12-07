package com.find.second.largest.element.in.array;

public class FindSecondLargestElement {

	public static void main(String[] args) {
	
		int[] array = {2,1,5,3,6,8};
		
		System.out.println(secondLargestElement(array));
	}
	
	public static int secondLargestElement(int[] array) {
		
          int first=array[0];		
          int second=array[0];
		
          if(array.length <=1) {
        	  second =-1;
          }else {
        	  
             for(int i=0;i<array.length;i++) {
        	  
        	  if(array[i] > first) {
        		  second = first;
        		  first = array[i];
        	  }
        	  else if(second < array[i]) {
        		  second = array[i];
        	  }
         }
       }
          System.out.println(first);
         return second;
	}

}





