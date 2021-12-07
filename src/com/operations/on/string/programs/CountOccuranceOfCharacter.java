package com.operations.on.string.programs;

public class CountOccuranceOfCharacter {

	public static void main(String[] args) {
		
		String str ="raminder";
		
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if("R".equalsIgnoreCase(String.valueOf(c))) {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
