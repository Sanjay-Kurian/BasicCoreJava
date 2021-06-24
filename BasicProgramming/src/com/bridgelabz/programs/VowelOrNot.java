package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VowelOrNot {
	public static void main(String[] args) {
		System.out.println("Enter an alphabet");
		Utility utility = new Utility();
		char alphabet = utility.getCharacter();
		utility.vowelOrConsonant(alphabet);
}
}
