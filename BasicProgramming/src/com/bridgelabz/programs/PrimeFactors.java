package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Utility utility = new Utility();
		int number = utility.getValue();
		utility.primeFactor(number);
	}
}
