package week1.day1;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * What are my learnings from this code?
	 * 1) For Loop
	 * 2) Using of Unary operator 
	 * 
	 */	
	
	public static void main (String[] args) {
		
		int input = 5;
		int fact = 1;
		for (int i=1; i<=input;i++)
		{
			fact*=i;
			
		}
		System.out.println(fact);
		
	}

}
