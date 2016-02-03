/*
	Comparison.java
	Compate integers using if statements, relational operators
	and equality operators
	Christine on 02 Feb 16
*/

import java.util.Scanner;	// program uses class Scanner

public class Comparison
{
	// main method begins execution of Java app
	public static void main(String args[])
	{
		// create scanner to obtain input from command window
		Scanner input = new Scanner( System.in );

		int number1, // initialize number1 and number2 to compare
		number2;

		System.out.print( "Enter first integer: " ); // prompt
		number1 = input.nextInt(); // read first number from user

		System.out.print( "Enter second integer: " ); // prompt
		number2 = input.nextInt(); // read second number from user

		if ( number1 == number2 )
			System.out.printf( "%d == %d\n", number1, number2 );
		
		if ( number1 != number2 )
			System.out.printf( "%d != %d\n", number1, number2 );
		
		if ( number1 < number2 )
			System.out.printf( "%d < %d\n", number1, number2 );
		
		if ( number1 > number2 )
			System.out.printf( "%d > %d\n", number1, number2 );
		
		if ( number1 <= number2 )
			System.out.printf( "%d <= %d\n", number1, number2 );
		
		if ( number1 >= number2 )
			System.out.printf( "%d >= %d\n", number1, number2 );
	} // end main method
} // end Comparison class
