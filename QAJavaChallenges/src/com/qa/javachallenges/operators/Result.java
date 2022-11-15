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
		
		public void result1 () {
			System.out.println("Physics: " + this.physics + "/150.");
			System.out.println("Chemistry: " + this.chemistry + "/150j.");
			System.out.println("Biology: " + this.biology + "/150.");
			System.out.println("Total: " + this.total + "/450.");
			
		}
		
		public void result2() {
			DecimalFormat df = new DecimalFormat("#.#");
			System.out.println("Percentage: " + df.format(this.percentage) + "%.");
		}
		
		public void result3() {
			
		}
}
 