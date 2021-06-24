package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter x coordinate");
		Utility utility = new Utility();
		int x = utility.getValue();
		System.out.println("Enter y coordinate");
		int y = utility.getValue();
		utility.distance(x, y);
	}
}
