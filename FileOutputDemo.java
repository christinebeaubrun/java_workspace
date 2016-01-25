import java.io.*; // java.io has a lot of methods available to us so the asterick makes it possible

/*
** File Output Demo
** Demonstration of FileOutputStream and
** Printstream classes
*/
class FileOutputDemo
{
	public static void main(String args[])
	{
		FileOutputStream out; // declare a file output object which will contain our text
		PrintStream p; // declare a print stream object
		
		try
		{
			// create a new file output stream named 'myfile.txt'
			// connected to myfile.txt
			out = new FileOutputStream("myfile.txt");

			// connect print stream to the output stream
			p = new PrintStream( out );
			
			// write to myfile.txt using the print stream
			p.println("Christine wrote this line for myfile.txt");
			
			// done writing? close file
			p.close();
		}
		catch (Exception e)
		{
			// catches all possible errors
			System.err.println("Error writing to file");
		}
	}
}
