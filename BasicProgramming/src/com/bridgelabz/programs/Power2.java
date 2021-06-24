package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Power2 {
	public static void main(String[] args) {
		System.out.println("Enter the power of 2 (less than 31)");
		Utility utility = new Utility();
		int value = utility.getValue();
		utility.table(value);
}
}
