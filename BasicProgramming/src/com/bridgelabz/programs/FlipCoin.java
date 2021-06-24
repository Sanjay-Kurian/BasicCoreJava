package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;
public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter number of times to flip");
		Utility utility = new Utility();
		int numberOfFlip = utility.getValue();
		utility.flipCoin(numberOfFlip);
	}
}
