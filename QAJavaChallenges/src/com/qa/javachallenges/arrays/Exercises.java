package com.qa.javachallenges.arrays;

public class Exercises {
//	1 Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
	public void exm1() {
		int[] val = new int [10];
		for(int i = 0; i < 10; i++) {
			val[i] = 1 + (i+i);
		}
		for (int i = 0; i < val.length; i++) {
			System.out.println(val[i]);
		}
	}
//	2 Create a for loop that populates an integer array with values, outputting them at each iteration.
//	Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
	public void exm2() {
		int[] val = new int [10];
		for(int i = 0; i < 10; i++) {
			val[i] = 3 + (i+i);
			System.out.println(val[i]);
		}
	}
}
