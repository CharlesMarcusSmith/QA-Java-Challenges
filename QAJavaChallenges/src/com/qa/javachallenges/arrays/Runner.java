package com.qa.javachallenges.arrays;

public class Runner {
	public static void main(String[] args) throws Exception {
		Exercises ex = new Exercises();
		
//		1 Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
		ex.exm1();
//		2 Create a for loop that populates an integer array with values, outputting them at each iteration.
//		Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
		ex.exm2();
		
//		Numbers
		Numbers num = new Numbers();
//		Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
		num.numm1(63);
		num.numm2assembly(num.numm2a(93));
		num.numm2assembly(num.numm2a(1345));
		num.numm2assembly(num.numm2a(6005));
		num.numm2assembly(num.numm2a(7300));
		num.numm2assembly(num.numm2a(6015));
		num.numm2assembly(num.numm2a(5));
		num.numm2assembly(num.numm2a(13));
		num.numm2assembly(num.numm2a(1030));
//		Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//		Expand on the method you wrote in step 2 to allow the input 1-999.
//		Expand the method you wrote in step 2 to allow the input 1-9999.
//		Use a for()-loop to print the numbers 1-100 in words.
		
//		For example; 1 = one, 100 = one hundred.
	}
}
