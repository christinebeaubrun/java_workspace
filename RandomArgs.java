public class RandomArgs
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt( args[0] );
		int b = Integer.parseInt( args[1] );
		int result = (int) ( a * Math.random()) + b;
		System.out.print( result );
	}
}
