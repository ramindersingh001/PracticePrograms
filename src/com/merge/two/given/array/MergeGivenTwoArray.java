package com.merge.two.given.array;

public class MergeGivenTwoArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 3, 4, 6 };
		int[] array2 = { 2, 5, 7, 8 };

		int[] temp = new int[array1.length + array2.length];

		int i = 0, j = 0, k = 0;

		while (i < array1.length && j < array2.length) {

			if (array1[i] < array2[j]) {
				temp[k++] = array1[i++];

			} else {
				temp[k++] = array2[j++];
			}

		}

		while (i < array1.length) {
			temp[k++] = array1[i++];
		}

		while (j < array2.length) {
			temp[k++] = array2[j++];
		}

		System.out.println("Array elements after merging: ");

		for (Integer a : temp) {
			System.out.println(a);
		}

	}

}
