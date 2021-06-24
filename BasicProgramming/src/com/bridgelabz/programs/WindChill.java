package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter temperature t (in Fahrenheit) and the wind speed v (in miles per hour)");
		Utility utility = new Utility();
		double t = utility.getValue();
		double v = utility.getValue();
		utility.windChill(t, v);
	}
}
