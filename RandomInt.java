public class RandomInt
{
	public static void main(String[] args)
	{
		// int before the variable N describes the type
		// of value the Integer class will return upon execution of parseInt method 
		int N = Integer.parseInt( args[0] );
		
		// double is used for Math.random because it always returns a double between
		// zero and one
		double r = Math.random();

		// returns a random integer between zero and the value of N
		// type has to be specified often
		int n = ( int ) ( r * N );
		
		System.out.println( n );
	}
}
