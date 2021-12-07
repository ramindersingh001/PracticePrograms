package com.array.program;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 4, 5 };

		int sum = 0;
		int total = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}

		for (int i = 1; i <= array[array.length - 1]; i++) {

			total += i;
		}

		System.out.println("Missing number is : " + (total - sum));

	}

}
