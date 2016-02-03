/*
	LargeSmallEqual java program ask a user for two integers and returns which of the two 
	numbers is the largest, smallest, or whether the two are equal
	Christine on 02 Feb 16
*/

import java.util.Scanner;

public class LargeSmallEqual
{
	// execution of main method
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in ); // initialize input variable as Scanner instance
		
		int num1, num2; // initialize empty int variables

		System.out.print( "Please provide an interger: " );
		num1 = input.nextInt();

		System.out.print( "Please provide a second integer: " );
		num2 = input.nextInt();

		if ( num1 > num2 )
			System.out.printf( "%d greater than %d\n", num1, num2 );
		
		if ( num2 > num1 )
			System.out.printf( "%d greater than %d\n", num2, num1 );

		if ( num1 < num2 )
			System.out.printf( "%d less than %d\n", num1, num2 );

		if ( num2 < num1 )
			System.out.printf( "%d less than %d\n", num2, num1 );

		if ( num1 == num2 )
			System.out.printf( "%d and %d are equal", num1, num2 );
	}	// end main execution
} // end class
