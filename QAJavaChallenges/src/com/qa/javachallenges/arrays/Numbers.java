package com.qa.javachallenges.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {
//	Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
	public void numm1(int a) {
		if(a >= 10 && a <= 99) {	//checking if between 10 and 99
			List<Integer> digits = new ArrayList<>();
			
			//Using modulus to work out the remainder of the division (a digit), then diving the number and getting the next digit.
			//From testing this seems to work for 3 digits too so should work as a solution for all exercises.
			while (a > 0) {
				digits.add(a%10);
				System.out.println(a%10);
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
	
	//Storing number provided as digits
	public List<Integer> numm2a(int value) {
		List<Integer> digits = new ArrayList<>();		
		if(value > 0 && value <= 9999) {
			//Splitting digits up using modulus to get remainder of each
			while (value > 0) {
				digits.add(value % 10);
				value = value / 10;
			}
			
			//Reversing the digits order as its appended in reverse due to modulus method
			Collections.reverse(digits);
			
			System.out.println("The digits in question are as follows:");
			for(int i = 0; i < digits.size(); i++) {																			
				System.out.println(digits.get(i));
			}
			
			return digits;
		}
		else {
			return 0;	//Need to create an exception here to avoid returning a list
		}
	}
	//Creating String representations and methods to return the position in the array in question
	public String numm2unit (int digit) {
		//1 - 9 on the units digit
		List<String> units = new ArrayList<>();
		Collections.addAll(units, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
		
		return units.get(digit);
	}
	public String numm2teen (int digit) {
		//10 - 19, so if second to last digit = 1, this is used.
		List<String> teens = new ArrayList<>();
		Collections.addAll(teens, "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
		
		return teens.get(digit);
	}
	
	public String numm2tens (int digit) {
		//2-9 on the tens digit
		List<String> tens = new ArrayList<>(); 
		Collections.addAll(tens, "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety");
				
		return tens.get(digit);
	}
	
//	public void numm2assembly (List<Integer> digits) {
//		
//	}
}
