package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Utility utility = new Utility();
		int num = utility.getValue();
		utility.evenOrOdd(num);
	}
}
