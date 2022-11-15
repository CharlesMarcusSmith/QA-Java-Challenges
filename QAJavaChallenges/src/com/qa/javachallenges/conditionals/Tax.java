package com.qa.javachallenges.conditionals;

public class Tax {
	public int tm1 (int sa) {
		if (sa <= 14999) {
			return 0;
		}
		else {
			if (sa <= 19999) {
				return 10;
			}
			else {
				if (sa <= 29999) {
					return 15;
				}
				else {
					if (sa <= 49999) {
						return 20;
					}
					else {
						return 25;
					}
				}
			}
		}
	}
	
	public int tm2(int sa) {
		if (sa <= 14999) {
			return (sa * 0)/100;
		}
		else {
			if (sa <= 19999) {
				return (sa * 10)/100;
			}
			else {
				if (sa <= 29999) {
					return (sa * 15)/100;
				}
				else {
					if (sa <= 49999) {
						return (sa * 20)/100;
					}
					else {
						return (sa * 25)/100;
					}
				}
			}
		}
	}
}
