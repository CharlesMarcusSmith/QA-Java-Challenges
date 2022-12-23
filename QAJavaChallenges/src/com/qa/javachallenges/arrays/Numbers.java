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
	public List<Integer> numm2a(int value) throws Exception {
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
			//Need to create an exception here to avoid returning a list
			throw new Exception("Number must be between 1 and 9999");
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
	
	public void numm2assembly (List<Integer> digits) {
		//This is a counter used to count how many digits are being verbalised, meaning we dont have to write multiple methods for different digit sized numbers
		//E.g. a 4 digit number will use all 4 digits so we need to move the counter every time, but a 2 digit number will only have to move the counter twice
		//This is to avoid the issue of the beginning of the number always beginning at the 0 position of the array list, without having to make multiple methods for each size
		int dc = 0;	
		
		if(digits.size() >= 4) {
			if(digits.get(0+dc) != 0) {
				System.out.print(numm2unit(digits.get(0+dc)-1) + " thousand "); //dc will be 0 in this case, but was included for potential future functionality as no harm done.
				dc++;
			}
		}
		if(digits.size() >= 3) {
			if(digits.get(0+dc) != 0) {
				System.out.print(numm2unit(digits.get(0+dc)-1) + " hundred "); //dc will be 0 in this case, but was included for potential future functionality as no harm done.
				dc++;
			}
		}
		
		System.out.println("and "); //used to seperate wording like you typically would when saying a big number, i.e. 'five thousand and five'.
		
		if(digits.size() >= 2) {
			if(digits.get(0+dc) != 1) {
				//Tens and Units in here
				if(digits.get(0+dc) != 0) {
				System.out.print(numm2tens(digits.get(0+dc)-2) + " "); //dc will be 0 in this case, but was included for potential future functionality as no harm done.
				//This is -2 as there is no String for 10, this is handled by the teens array
				
				}
				
				dc++;
				
				if(digits.get(0+dc) != 0) {
					System.out.println(numm2unit(digits.get(0+dc)-1) + "."); //dc will be 0 in this case, but was included for potential future functionality as no harm done.
					//println used as the last line in the sequence - allows multiple iterations with multiple numbers.
				}
			}
			else {
				if(digits.get(0+dc) != 0) {
					System.out.println(numm2teen(digits.get(0+dc)-1) + "."); //dc will be 0 in this case, but was included for potential future functionality as no harm done.
					//println used as the last line in the sequence - allows multiple iterations with multiple numbers.
				}
			}
		}
	}
}
