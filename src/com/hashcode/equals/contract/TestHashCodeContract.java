package com.hashcode.equals.contract;

import java.util.HashMap;
import java.util.Map;

public class TestHashCodeContract {

	public static void main(String[] args) {
		
		Map<Employee, String> map = new HashMap<Employee,String>();
		
		map.put(new Employee(1, "Raminder"),"IT");
		map.put(new Employee(1, "Raminder"),"IT");
		map.put(new Employee(2, "Raminder"),"IT");
		
		System.out.println(map.size());

	}

}
