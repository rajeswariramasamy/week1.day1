package week1.day1;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not 
	 * input: 13 output: 13 is a Prime Number
	 */
	public static void main(String[] args) {
		
		int input = 13 ;
		boolean isPrime = false;
		
		for (int i=2; (i<=input/2); i++) 
		{
			
			if ((input % i) == 0)
			{
			isPrime = true;
			break;	
			}
		
		}	
	if (isPrime)
	{
		System.out.println(input +" is not a Prime Number");
	}
	else
	{
		System.out.println(input + " is a Prime Number");
	}
	}

}
