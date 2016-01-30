public class RollDice
{
	public static void main(String[] args)
	{
		int min = 1, max = 6;
		int result = min + (int)(Math.random() * (( max - min ) + 1));
		System.out.println( "Rolling dice . . . ");
		System.out.print( "You rolled a " + result ); 
	}
}
