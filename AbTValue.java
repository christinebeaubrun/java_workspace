public class AbTValue
{
	public static void main(String[] arg)
	{
		int a = Integer.parseInt( arg[0] );
		int b = Integer.parseInt( arg[1] );
		int t = a;
		b = t;
		a = b;
		System.out.println( "T is: " + t );
		System.out.println( "A is: " + a );
		System.out.println( "B is: " + b );
	}
}
