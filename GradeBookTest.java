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
		GradeBook gradeBook1 = new GradeBook( "CS101 Introduction to Java Programming" );
		GradeBook gradeBook2 = new GradeBook( "CS102 Data Structures in Java" );
		
		// display initial value of courseName
		System.out.printf( "gradeBook1 course name is: %s\n\n", gradeBook1.getCourseName() );
		System.out.printf( "gradeBook2 course name is: %s\n\n", gradeBook2.getCourseName() );


	} // end main
} // end class GradeBookTest
