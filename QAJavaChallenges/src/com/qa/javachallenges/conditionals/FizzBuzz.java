package com.qa.javachallenges.conditionals;

public class FizzBuzz {
	public String fbm1 (double a) {
		if(a%3 != 0 && a%5 != 0) {
			return "null";
		}
		else {
			if(a%3 == 0 && a%5 == 0) {
				return "FizzBuzz";
			}
			else {
				if (a%3 == 0) {
					return "Fizz";
				}
				else {
					return "Buzz";
				}
			}
		}
	}
}
