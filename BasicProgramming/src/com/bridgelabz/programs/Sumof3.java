package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Sumof3 {
	public static void main(String[] args) {
		System.out.println("Enter number of integers");
		Utility utility = new Utility();
		int number = utility.getValue();
		int[] nums = new int[number];
		utility.inputarray(nums);
		utility.sumOf3(nums);
	}
}
