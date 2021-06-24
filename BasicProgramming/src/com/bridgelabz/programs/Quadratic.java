package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter a in the equation a*x*x + b*x + c");
		Utility utility = new Utility();
		int a = utility.getValue();
		System.out.println("Enter b");
		int b = utility.getValue();
		System.out.println("Enter c");
		int c = utility.getValue();
		utility.roots(a, b, c);
	}
}
