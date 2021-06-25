package com.bridgelabz.utility;
import java.io.PrintWriter;
import java.util.Scanner;
public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	public int getValue()
	{
		return scanner.nextInt();
	}
	public char getCharacter()
	{
		return scanner.next().charAt(0);
	}
	public double getDouble() {
		// TODO Auto-generated method stub
		return scanner.nextDouble();
	}
	public boolean getBoolean() {
		// TODO Auto-generated method stub
		return scanner.nextBoolean();
	}
	//method to return flip coin percentage
	/**Purpose: To return the percentage of coin flip outcome.
	 *	 * @param  flip
	 *@return percentile 
	 */
	public void flipCoin(int flip)
	{	
		int heads=0,tails=0;
		if (flip > 0)
		{
			for (int i = 0;i < flip;i++)
			{
				double side = Math.random();
				if (side > 0.5)
				{
					heads++;
				}
				else
				{
					tails++;
				}
			}
			System.out.println("Number of heads ::"+heads);
			System.out.println("Number of tails ::"+tails);
			float headPercent = ((heads*100)/flip);
			float tailPercent = ((tails*100)/flip);
			System.out.println("Head percent "+headPercent + "%");
			System.out.println("Tail percent "+tailPercent + "%");	
		}
		else
		{
			System.out.println("Invalid number. Enter a number greater than 0");
		}	
	}
	
	//method to compute and display the power of 2
	public void table(int power)
	{
		if (power >= 0 && power < 31)
		{
			for (int i = 0;i <= power;i++)
			{
				System.out.println(Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("Invalid input. Might cause overflow");
		}
	}
	
	//method to display whether the given year is leap year or not
	public void leapYear(int year)
	{
		int  temp = year, count = 0;
		while (temp != 0)
		{
			count++;
			temp = temp/10;
		}
		if (count == 4)
		{
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
			{
				System.out.println("The year "+year+" is a leap year");
			}
			else
			{
				System.out.println("The year "+year+" is not a leap year");
			}
		}
		else
		{
			System.out.println("Invalid year. Enter a 4 digit year");
		}
		
	}
	
	//method to compute and display the harmonic number for given harmonic value
	public void harmonicNumber(int harmonic)
	{	
		float sum = 0;
		if (harmonic != 0)
		{
			for (float i = 1;i <= harmonic;i++)
			{
				sum = sum + (1/i);
			}
			System.out.println("The harmonic number is "+sum+" for a given harmonic value "+harmonic);
		}
		else
		{
			System.out.println("Invalid input. The harmonic number will be undefined");
		}
	}

	//method to compute and display the prime factors of a given number
	public void primeFactor(int number)
	{
		int temp = number;
		for (int i = 2;i <= number; i++)
		{
			while (temp % i == 0 && temp != 0)
			{
				temp = temp / i;
				System.out.println(i);
			}
		}
	}
	
	//method to compute and display the quotient and remainder for given dividend and divisor
	public void quotientRemainder(int dividend,int divisor)
	{
		System.out.println("The quotient is "+dividend/divisor);
		System.out.println("The remainder is "+dividend%divisor);
	}
	
	//method to swap the given numbers and display
	public void swap(int num1,int num2)
	{
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("The swapped numbers are "+num1+" "+num2);
	}
	
	//method to display whether the given number is odd or even
	public void evenOrOdd(int num)
	{
		if (num % 2 == 0)
		{
			System.out.println("The number "+num +" is even");
		}
		else
		{
			System.out.println("The number "+num +" is odd");
		}
	}
	
	//method to display whether the given alphabet is vowel or consonant 
	public void vowelOrConsonant(char alphabet)
	{
		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||
				alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')
		{
			System.out.println("The alphabet is a vowel");
		}
		else
		{
			System.out.println("The alphabet is a consonant");
		}
	}
	
	//method to compute and display the largest number out of the given numbers
	public void largest(int num1, int num2, int num3)
	{
		if (num1 > num2 && num1 >num3)
		{
			System.out.println("The first number "+num1+" is the maximum number");
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("The second number "+num2+" is the maximum number");
		}
		else
		{
			System.out.println("The third number "+num3+" is the maximum number");
		}
	}
	
	//methods to initialize the array and compute triplets
	public void inputarray(int[] nums)
	{
		for (int i = 0;i < nums.length;i++)
		{
			nums[i]=scanner.nextInt();
		}
	}
	public void sumOf3(int[] nums)
	{
		int count = 0;
		for(int i = 0;i < nums.length-2;i++)
		{
			for(int j = i+1;j < nums.length-1;j++)
			{
				for(int k = j+1;k < nums.length;k++)
				{
					if (nums[i] + nums[j] + nums[k] == 0)
					{
						count++;
						System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
					}
				}
			}
		}
		System.out.println("Total number of triplets are "+count);
	}
	
	//method to compute the euclidean distance
	public void distance(int x,int y)
	{
		System.out.println(Math.sqrt((x*x) + (y*y)));
	}
	
	//method to compute and display the roots of a quadratic equation
	public void roots(int a, int b, int c)
	{
		double delta = (b * b) - (4 * a* c);
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("The two roots of the quadratic equation are "+root1+" and "+root2);
	}
	
	//method to compute and display wind chill
	public void windChill(double t,double v)
	{
		if(t < 50 && v >= 3 && v <= 120)
		{
			double w = (35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
			System.out.println("The wind chill is "+w);
		}
		else
		{
			System.out.println("Invalid input. The temperature should be above 50 and wind speed should be between 3 and 120");
		}
		
	}
	public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
		PrintWriter printwriter = new PrintWriter(System.out);
		// TODO Auto-generated method stub
		for (int i =0;i<rows;i++)
		{
			for (int j =0;j<columns;j++)
			{ 
				printwriter.write(inputArray[i][j]+" ");
				printwriter.flush();
				//System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}

