public class TriangleSides
{
	public static void main(String[] args)
	{
		int side1 = Integer.parseInt( args[0] );
		int side2 = Integer.parseInt( args[1] );
		int side3 = Integer.parseInt( args[2] );

		boolean result = ( (side3 >= side1 + side2) || (side2 >= side1 + side3) || (side1 >= side2 + side3) );
		System.out.print( result );
	}
}
