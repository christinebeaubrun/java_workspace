public class PrintValues
{
	public static void main(String[] arg)
	{
		// performs string concatenation only
		System.out.println( 2 + "bc" );
		
		// adds 2 + 3 before concatenating to string
		System.out.println( 2 + 3 + "bc" );

		// adds 2 + 3 before concatenating to string
		System.out.println( ( 2 + 3 ) + "bc" );

		// adds 2 + 3 before concatenating to string
		System.out.println( "bc" + ( 2 + 3 ) );

		// performs string concatenation only
		System.out.println( "bc" + 2 + 3 );
	}
}
