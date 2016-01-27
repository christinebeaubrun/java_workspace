public class ParseBoolean
{
	public static void main(String[] args)
	{
		boolean a, b, result;
		a = Boolean.parseBoolean( args[0] );
		b = Boolean.parseBoolean( args[1] );
		
		result = ( !(a && b) && (a || b) || ((a && b) || !(a || b)) );
		System.out.println( "Result: " + result );
	}
}
