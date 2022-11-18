package com.qa.javachellenges.iterations;

public class ChangeCalc {
	public double ccm1(double cash, double charge) {
		// Method used for calculating change amount.
		if (cash >= charge && cash > 0 && charge > 0) {
			double change = cash - charge;
			System.out.println("Change: " + change);
			return change;
		}
		else {
			return 0;
		}
	}
	
	// Method used for printing the specific coinage count
	public void ccm2a(double a) {
		double amount = a;
		
		while (amount > 0.00)  {
			amount = ccm2b(amount, 10.00, "10 pound note");
			amount = ccm2b(amount, 5.00, "5 pound note");
			amount = ccm2b(amount, 2.00, "2 pound coin");
			amount = ccm2b(amount, 1.00, "1 pound coin");
			amount = ccm2b(amount, 0.50, "50 pence coin");
			amount = ccm2b(amount, 0.20, "20 pence coin");
			amount = ccm2b(amount, 0.10, "10 pence coin");
			amount = ccm2b(amount, 0.05, "5 pence coin");
			amount = ccm2b(amount, 0.02, "2 pence coin");
			amount = ccm2b(amount, 0.01, "1 pence coin");
		}
	}
	
	public double ccm2b (double a, double coin, String cName) {
		double amount = a;
		
		if(amount >= coin) {
			int count = 0;
			while (amount >= coin) {
				amount = amount - coin;
				count++;
			}
			if(count > 1) {
				System.out.println(count + " " + cName + "s.");
			}
			else {
				System.out.println(count + " " + cName + ".");
			}
		}
		
		return amount;
	}
}
