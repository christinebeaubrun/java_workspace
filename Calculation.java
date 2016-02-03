/*
	Calculation program that obtains two integers from the user and returns
	their sum, product, difference, and quotient value
*/

import java.util.Scanner;	// import class Scanner

public class Calculation
{	// execution of main method
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in ); // create new Scanner instance
		
		int num1, // empty initilization of variable num1 and num2
		num2;
		
		System.out.print( "Please enter your first ingeter: " ); // prompt
		num1 = input.nextInt(); // first assignment

		System.out.print( "Please enter your second integer: " ); // prompt
		num2 = input.nextInt();	// second assignment

		System.out.printf( "%d + %d = %d\n", num1, num2, ( num1 + num2 ));
		System.out.printf( "%d * %d = %d\n", num1, num2, ( num1 * num2 ));
		System.out.printf( "%d - %d = %d\n", num1, num2, ( num1 - num2 ));
		System.out.printf( "%d / %d = %d\n", num1, num2, ( num1 / num2 ));
	}	// end of main method execution
}	// end of class Calulation
