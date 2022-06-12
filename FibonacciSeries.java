package week1.day1;



public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 */
	
	
	public static void main(String[] args)
	{

		int range = 8;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		
		System.out.println("First Num is: "+ firstNum);
		
		for (int i=1;i<=range;i++)
		{
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
		System.out.println(sum);	
		}
	}
	
}
