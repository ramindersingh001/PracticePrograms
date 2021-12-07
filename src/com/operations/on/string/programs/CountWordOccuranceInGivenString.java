package com.operations.on.string.programs;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccuranceInGivenString {

	public static void main(String[] args) {

		String str = "Raminder Singh Raminder r";
		String[] array = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < array.length; i++) {

			if (map.containsKey(array[i])) {

				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
        }

		System.out.println(map);

	}

}
