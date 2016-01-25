class AccountDemo
{
	public static void main(String[] args) {

		// create an empty account
		Account my_account = new Account();
		System.out.println( "Initial deposit " + my_account.getbalance() );

		// deposit money
		my_account.deposit( 250.00 );

		// print current balance
		System.out.println( "Current balance " + my_account.getbalance() );

		// withdraw money
		my_account.withdraw(80.00);

		// print remaining balance
		System.out.println( "Remaining balance " + my_account.getbalance() );
	}
}
