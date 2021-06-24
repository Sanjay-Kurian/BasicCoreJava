package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Quotient {
	public static void main(String[] args) {
		System.out.println("Enter the dividend");
		Utility utility = new Utility();
		int dividend = utility.getValue();
		System.out.println("Enter the divisor");
		int divisor = utility.getValue();
		utility.quotientRemainder(dividend,divisor);
	}
}
