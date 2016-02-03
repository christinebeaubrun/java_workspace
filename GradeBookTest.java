/*
	GradeBookTest.java
	Create a GradeBook object and call its displayMessage method
*/

import java.util.Scanner; // program uses Scanner
public class GradeBookTest
{	
	// main method begins program execution
	public static void main( String args[] )
	{
		// create a type GradeBook object / instance and assign it to myGradeBook
		GradeBook myGradeBook = new GradeBook();

		// create scanner to obtain input from command line
		Scanner input = new Scanner( System.in );

		System.out.print( "Please enter a course name: " );		
		String nameOfCourse = input.nextLine(); // read a line of text

		// call myGradeBook's displayMessage method with nameOfCourse as param
		myGradeBook.displayMessage( nameOfCourse );
	} // end main
} // end class GradeBookTest
