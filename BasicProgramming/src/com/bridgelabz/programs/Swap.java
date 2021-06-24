package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Enter first number");
		Utility utility = new Utility();
		int num1 = utility.getValue();
		System.out.println("Enter second number");
		int num2 = utility.getValue();
		utility.swap(num1, num2);
	}
}
