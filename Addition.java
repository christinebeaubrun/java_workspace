// Addition program that displays the sum of two numbers
// Christine on 02 Feb 16

import java.util.Scanner; // program uses class Scanner

public class Addition
{
	// main method begins execution of java app
	public static void main(String args[])
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner( System.in );

		int number1; 	// first number to add
		int number2;	// second number to add
		int sum;	// sum of number1 and number2

		System.out.print( "Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user
		
		System.out.print( "Enter second integer: "); // prompt
		number2 = input.nextInt(); // read second number from user

		sum = number1 + number2; // add the two numbers

		System.out.printf( "Sum is %d\n", sum ); // display sum 
	} // end method main
} // end Class Addition
