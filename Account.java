public class Account
{
	protected double balance;

	// constructor to initialize balance
	public Account ()
	{
		balance = 0.0;
	}

	// overloaded constructor for empty balance
	public void deposit ( double amount )
	{
		balance += amount;
	}

	public double withdraw ( double amount )
	{
		// see if amount can be withdrawn
		if ( balance >= amount ) {
			balance -= amount;
			return amount;
		}
		else
			// withdrawal not allowed
			return 0.0;
	}

	public double getbalance ()
	{
		return balance;
	}
}
