package com.custom.immutability.example;

import java.math.BigDecimal;
import java.util.Date;

public final class Student {

	private final int rollNo;
	private final String name;
	private final BigDecimal marks;
	private final Date dob;
	
	public Student(int rollNo, String name, BigDecimal marks, Date dob) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.dob = dob;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getMarks() {
		return marks;
	}

	public Date getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", dob=" + dob + "]";
	}	
}
