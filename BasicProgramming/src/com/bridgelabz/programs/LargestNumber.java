package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LargestNumber {
	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Utility utility = new Utility();
		int num1 = utility.getValue();
		System.out.println("Enter the second number");
		Utility utility1 = new Utility();
		int num2 = utility1.getValue();
		System.out.println("Enter the third number");
		Utility utility2 = new Utility();
		int num3 = utility2.getValue();
		utility.largest(num1, num2, num3);
	}
}
