package com.operations.on.string.programs;

public class CheckVowelPresentInString {

	public static void main(String[] args) {
		
		String str = "raminder";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(c=='i' || c =='o' || c=='a' || c=='e' || c=='u') {
				System.out.println("true");
			}
			break;
		}
		
		//System.out.println(count);
		
		
		boolean flag = str.toLowerCase().matches(".*[aeiou].*");
		System.out.println(flag);
	}

}
