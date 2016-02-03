/*
	GradeBookTest.java
	Create and manipulate a GradeBook object
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
		
		// display initial value of courseName
		System.out.printf( "Initial course name is: %s\n\n", myGradeBook.getCourseName() );

		System.out.print( "Please enter a course name: " );		
		String nameOfCourse = input.nextLine(); // read a line of text
		myGradeBook.setCourseName( nameOfCourse ); // set the course name

		// call myGradeBook's displayMessage method
		myGradeBook.displayMessage();
	} // end main
} // end class GradeBookTest
