/*
	FiveNumberSeperation java program takes a user's input of a five digit number and
	returns it with three-length space between each number
*/

import java.util.Scanner;

public class FiveNumberSeperation
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		int userNumber,
		num1,
		num2,
		num3,
		num4,
		num5;

		System.out.print( "Please provide a five digit number: " );
		userNumber = input.nextInt();

		num1 = userNumber / 10000; // value is 4.2339 but only the integer is returned, no remainder so 4
		num2 = (( userNumber % 10000) / 1000); // dealing with remainder 2339, divided by 1000 is 2.339, keep 2
		num3 = (( userNumber % 1000) / 100); // dealing with remainder 339, divided by 100 is 3.39, keep 3
		num4 = (( userNumber % 100) / 10); // dealing with remainder 39, divded by 10 is 3.9, keep 3
		num5 = userNumber % 10; // dealing with the last number 9
		System.out.printf( "%d   %d   %d   %d   %d", num1, num2, num3, num4, num5 );
	}
}
