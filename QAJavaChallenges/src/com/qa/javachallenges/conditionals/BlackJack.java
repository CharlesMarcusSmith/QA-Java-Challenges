package com.qa.javachallenges.conditionals;

public class BlackJack {
	public int bjm1(int a, int b) {
		if (a >= 1 && b >= 1) {
			if(a <= 21 && b <= 21) {
				if (a > b) {
					return a;
				}
				else {
					return b;
				}
			}
			else {
				if (a > 21 && b > 21) {
					return 0;
				}
				else {
					if (a > 21) {
						return b;
					}
					else {
						return a;
					}
				}
			}
		}
		else {
			return 0;
		}
	}	
}
