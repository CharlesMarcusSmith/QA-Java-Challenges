 package com.qa.javachallenges.operators;

public class Runner {
		public static void main(String[] args) {
//			Calculator
			Calculator calc = new Calculator();
			
//			Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
			System.out.println(calc.addition(3, 1));
//			Create the following additional three methods that each take two parameters:
			int testA = 25;
			int testB = 4;
//			Multiplication - which takes two numbers and returns the product.
			System.out.println(calc.multiplication(testA, testB));
//			Subtraction - which takes two numbers, then returns the result of the subtraction.
			System.out.println(calc.subtraction(testA, testB));
//			Division - which takes two numbers, then returns the result of the division.
//			Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. 
//			Modify the division method so that it takes Double parameters and then return a Double, if not already.
			System.out.println(calc.division(testA, testB));
			
//			Results
//			A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. 
//			When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
			Result candidate1 = new Result (125, 145, 150);
			
//			Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:

//			Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
			candidate1.rm1();
//			Method 2 - which finds and displays the percentage that the person received for the exams overall.
			candidate1.rm2();
			
		}
}
