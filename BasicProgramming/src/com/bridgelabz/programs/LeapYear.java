package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year");
		Utility utility = new Utility();
		int year = utility.getValue();
		utility.leapYear(year);
	}
}
