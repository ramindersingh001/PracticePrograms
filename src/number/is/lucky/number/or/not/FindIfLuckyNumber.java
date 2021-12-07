package number.is.lucky.number.or.not;

import java.util.ArrayList;
import java.util.Scanner;

public class FindIfLuckyNumber {

	public static void main(String[] args) {
		
		//Lucky number if - number's first half sum = number second half sum,,,,,,, number will always be of even length
		
		System.out.println("Input a number:");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		//System.out.println(checkLuckyNumber(num));
		
		System.out.println(checkLuckyNumberInGiven(num));

	}
	
	public static String checkLuckyNumber(int number) {
		
		String status="Yes";
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (number > 0) {
			int temp = number % 10;
			list.add(temp);
			number = number / 10;
		}
		
		int sumSecond =0, sumFirst=0;
		int i=0,size=list.size()/2;
		while(i!=list.size())
		{
			if(i !=size && i <=size) {
				sumSecond+=list.get(i);
			}
			else {
				sumFirst+=list.get(i);
			}
			i++;
		}
		
		if(sumFirst!=sumSecond)
			status="NO";
		
		return status;
	}
	
	
	//Second way
	
	
	public static String checkLuckyNumberInGiven(int number) {
		
		String status = "Yes";
		int sumSecond=0,sumFirst=0;
		String num = String.valueOf(number);
		for(int i=0;i<num.length();i++) {
			
			if(i!=num.length()/2 && i <= num.length()/2) {
				sumFirst+=num.charAt(i);
			}else {
				sumSecond+=num.charAt(i);
			}
		}
		
		if(sumFirst !=sumSecond)
			status="No";
		
		return status;
	}
}
