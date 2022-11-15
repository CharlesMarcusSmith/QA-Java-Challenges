package com.qa.javachallenges.operators;

public class Calculator {
	public int addition (int a, int b) {
		int ab = a + b;
		return ab;
	}
	
	public int subtraction (int a, int b) {
		int ab = a - b;
		return ab;
	}
	
	public int multiplication (int a, int b) {
		int ab = a * b;
		return ab;
	}
	
	public double division (double a, double b) {
		if(a < b) {
			double ab = a / b;
			return ab;
		}
		else {
			System.out.println("Division cannot be perfromed");
			return 0;
		}
		
	}
}
