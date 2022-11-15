package com.qa.javachallenges.conditionals;
import com.qa.javachallenges.operators.*;

public class Runner {
	public static void main(String[] args) {
//		Exercises
//		Calculator Revisited
//		Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.
		Calculator c1 = new Calculator();
		c1.division(2, 1);
		
		
//		Results Revisited
//		Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.		
//		Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
//
//		eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
//
//		they would have an overall grade of 85.3% (Pass)
//
//		but in this case the student would fail because their physics grade is 54% (Fail)
//
//		Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.

		Result r1 = new Result(150, 150, 84);
		r1.rm1();
		r1.rm2();
		r1.rm3();
		
		
//		Flowcharts
//		Create a method which accepts 3 parameters, 2 integers and a boolean.

//		If the boolean is true, the method will return a sum of the two numbers, and it if is false it will return the multiplication of the two numbers.
//		For example:
		Flow flow = new Flow();
//		Input (1, 2, true) -> 3
		System.out.println(flow.fm1(1,2, true));
//		Input (3, 3, false) -> 9
		System.out.println(flow.fm1(3,3, false));
//		Input (1, 1, true) -> 2
		System.out.println(flow.fm1(1,1, true));
//		Recreate the following flowchart as a project. Ensure that your logic and outputs match that of the flowchart.
//
//		BlackJack
		BlackJack jack = new BlackJack();
//		Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. If they both go over 21 then return 0.
//
//		 play (10, 21) -> 21
		System.out.println(jack.bjm1(10, 21));
//		 play (20, 18) -> 20
		System.out.println(jack.bjm1(20, 18));
//		 play (1, 22) -> 1
		System.out.println(jack.bjm1(1, 22));
//		 play (22, 23) -> 0
		System.out.println(jack.bjm1(22, 23));
		

//		Taxes
//		Create the tax class, it contains 2 methods.
		Tax tax = new Tax();
//		Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
		System.out.println(tax.tm1(75000) + "%.");
//		Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
		System.out.println(tax.tm2(75000));
//		These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
//
//		The salaries are taxed as below:
//
//		0 - 14,999 : 0% tax
//		15,000 - 19,999 : 10% tax
//		20,000 - 29,999 : 15% tax
//		30,000 - 44,999 : 20% tax
//		45,000+ : 25% tax

		
		

//		FizzBuzz
//		Create a method which returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
//		Return 'FizzBuzz' for numbers which are multiples of both three and five.
//		Return the input number for numbers that are neither.
		FizzBuzz fizz = new FizzBuzz();
		System.out.println(fizz.fbm1(1));
		System.out.println(fizz.fbm1(2));
		System.out.println(fizz.fbm1(3));
		System.out.println(fizz.fbm1(4));
		System.out.println(fizz.fbm1(5));
		System.out.println(fizz.fbm1(6));
		System.out.println(fizz.fbm1(14));
		System.out.println(fizz.fbm1(15));
		
		
		
		
	}
}
