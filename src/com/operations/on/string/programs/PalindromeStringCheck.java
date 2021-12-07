package com.operations.on.string.programs;

public class PalindromeStringCheck {

	public static void main(String[] args) {
		
		String str = "rar";
		boolean flag = true;
		for(int i=0;i < str.length()/2 ; i++) {
			
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				System.out.println("String is not a palindrome string");
				flag = false;
				break;
			}
			
		}

		
		if(flag) {
			System.out.println("Found string as palindrome..."+str.length());
		}
	}

}
