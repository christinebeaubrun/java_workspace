public class EvenDivide
{
	public static void main(String[] arg)
	{
		int a = Integer.parseInt( arg[ 0 ] ), b = Integer.parseInt( arg[ 1 ] );
		boolean result = ( ( a % b ) == 0 );
		System.out.print( result );
	}
}
