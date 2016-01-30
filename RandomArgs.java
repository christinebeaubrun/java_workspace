public class RandomArgs
{
	public static void main(String[] args)
	{
		int min = Integer.parseInt( args[0] );
		int max = Integer.parseInt( args[1] );
		
		// Math.random returns a double btwn [0,1] but not including 1
		// to get a specific range of values, subtract min from the max to cover
		// the range between the two values.
		// Math.random() * ( max - min ) returns values between [ 0, max - min ]
		// and where the value of max-min is not included. 
		// To increase the default min value of zero, add the custom min to get 
		// values in the range of [min,max] instead of [0, max-min]
		// To include max, add one to the sum of max - min
		// To truncate the decimal value returned by Math.random, cast an int
		int result = min + ( int ) (Math.random() * (( max - min ) + 1 ));
		System.out.print( result );
	}
}
