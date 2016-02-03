/*
	GradeBook java program that contains a courseName instance variable
	and methods to set and get its value
*/

public class GradeBook
{	
	private String courseName; // course name for this GradeBook
	
	// method to set the course name, void because it doesn't return a value
	public void setCourseName( String name )
	{
		courseName = name; // store the course name
	} // end method setCourseName
	
	// method to retrieve the course name and return a type String
	public String getCourseName()
	{
		return courseName;
	} // end mthod getCourseName

	// display a welcome message to the GradeBook user
	// by calling getCourseName in order to retrieve the value of
	// the private instance variable courseName
	public void displayMessage()
	{
		System.out.printf( "Welcome to the Grade Book for\n%s!\n", getCourseName() );
	} // end method displayMessage
} // end class GradeBook
