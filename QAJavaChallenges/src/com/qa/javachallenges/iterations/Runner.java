package com.qa.javachallenges.iterations;

public class Runner {
//	Given a cost and an amount, work out the change given in specific coinage.
//	For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
//	1 £10 note
//	1 £5 note
//	2 20p's
//	1 2p
	public static void main(String[] args) {
		ChangeCalc ccalc = new ChangeCalc();
		ccalc.ccm2a(ccalc.ccm1(20.00, 4.58));
	}
	
}
