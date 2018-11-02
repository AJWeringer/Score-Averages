/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: Lab2.java
// SPECIFICATION: test score averages
// FOR: CSE 110- Lab #2
// TIME SPENT: 60 minutes
//-----------------------------------------------------------*/



import java.util.Scanner;

public class Lab2 
{
	private static Scanner in;

	public static void main (String[] args)
	{
		in = new Scanner(System.in);
		
		int test1, test2, test3, test_tot;
		final int NUM_TESTS = 3;
		double average;
				
		System.out.print("This program will average your 3 test scores");
		System.out.print("Please enter Test score 1: ");
		test1= in.nextInt();
		System.out.print("Please enter Test score 2: ");
		test2 = in.nextInt();
		System.out.print("Please enter Test score 3: ");
		test3 = in.nextInt();
		
		test_tot = test1 + test2 + test3;
		average = test_tot / (double)NUM_TESTS;
		
		System.out.println("Your average is: " + average);
		
		
				
		
	}

}
