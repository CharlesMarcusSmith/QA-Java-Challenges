package com.qa.javachallenges.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {
//	Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
	public void numm1(int a) {
		if(a >= 10 && a <= 99) {
			List<Integer> digits = new ArrayList<>();
			
			while (a > 0) {
				digits.add(a%10);
				a = a / 10;
			}
			for(int i = digits.size(); i>0; i--) {
				System.out.println(digits.get(i-1));
			}
		}
	}
	
//	Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//	Expand on the method you wrote in step 2 to allow the input 1-999.
//	Expand the method you wrote in step 2 to allow the input 1-9999.
//	Use a for()-loop to print the numbers 1-100 in words.
//	For example; 1 = one, 100 = one hundred.
	public List<Integer> numm2a(int value) {
		List<Integer> digits = new ArrayList<>();		

		while (value > 0) {
			digits.add(value % 10);
			value = value / 10;
		}
		
		Collections.reverse(digits);
		return digits;
	}
	
	public void numm2b (List<Integer> digits) {
		List<String> units = new ArrayList<>();
		Collections.addAll(units, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
		
		//10 - 19, so if second to last digit = 1, this is used.
		List<String> teens = new ArrayList<>();
		Collections.addAll(teens, "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
		
		//2-9 on the tens digit
		List<String> tens = new ArrayList<>(); 
		Collections.addAll(units, "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety");
		
		
		for (int i = 0; i < units.size(); i++) {
			System.out.println(units.get(i));
		}
		 
		
		
	}
}
