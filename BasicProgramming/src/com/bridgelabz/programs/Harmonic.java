package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Harmonic {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter harmonic value");
		int harmonic = utility.getValue();
		utility.harmonicNumber(harmonic);
	}
}
