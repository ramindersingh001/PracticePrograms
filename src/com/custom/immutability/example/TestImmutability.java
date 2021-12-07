package com.custom.immutability.example;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestImmutability {

	public static void main(String[] args) {
		
		
		Student s = new Student(1, "Raminder", new BigDecimal(70.369),getDob("24/08/1986"));
		Student s1 = new Student(2, "ABC", new BigDecimal(70.369),getDob("18/02/1991"));
		Student s2 = new Student(3, "XYZ", new BigDecimal(70.369),getDob("17/02/1992"));
		
		HashMap<Student,String> map = new HashMap<Student,String>();
		
		map.put(s, "IT");
		map.put(s1, "CSE");
		map.put(s2, "ME");
		
		
		Set<Entry<Student,String>> set = map.entrySet();
		
		
		for(Entry<Student,String> map1 : set) {
			
			Student stu = map1.getKey();
			String value = map1.getValue();
			
			System.out.println(stu);
			System.out.println(value);
			
		}
		
		System.out.println("===============================================");
		
		s.getDob().setTime(8899555555122L);
		
		System.out.println(s);
		
		System.out.println(map.get(s));

	}
	
	private static Date getDob(String dob) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			return format.parse(dob);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
