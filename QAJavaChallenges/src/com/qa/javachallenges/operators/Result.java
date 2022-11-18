package com.qa.javachallenges.operators;

import java.text.DecimalFormat;

public class Result {
		int physics;
		int chemistry;
		int biology;
		double total;
		double percentage;
		public Result(int physics, int chemistry, int biology) {
			super();
			this.physics = physics;
			this.chemistry = chemistry;
			this.biology = biology;
			this.total = physics + chemistry + biology;
			this.percentage = (total*100)/450;
		}
		
		public void rm1() {
			System.out.println("Physics: " + this.physics + "/150.");
			System.out.println("Chemistry: " + this.chemistry + "/150.");
			System.out.println("Biology: " + this.biology + "/150.");
			System.out.println("Total: " + this.total + "/450.");
		}
		
		public void rm2() {
			DecimalFormat df = new DecimalFormat("#.#");
			System.out.println("Percentage: " + df.format(this.percentage) + "%.");
		}
		
		public void rm3() {
//			if(this.percentage < 60) {
//				System.out.println("Fail");
//				System.out.println("Reason: Overall percentage lower than 60%.");
//			}
			if ((this.physics*100)/150 >= 60 && (this.chemistry*100)/150 >= 60 && (this.biology*100)/150 >= 60) {
				System.out.println("Pass");
			}
			else {
				int count = 0;
				if ((this.physics*100)/150 < 60) {
					count++;
				}
				if ((this.chemistry*100)/150 < 60) {
					count++;
				}
				if ((this.biology*100)/150 < 60) {
					count++;
				}
				System.out.println("Fail.");
				System.out.println(count + " subjects failed.");
			}
		}
}
 