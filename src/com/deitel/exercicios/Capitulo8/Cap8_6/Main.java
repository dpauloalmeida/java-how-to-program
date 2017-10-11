package Cap8_6;

public class Main
{

	public static void main( String[] args )
	{
		SavingAccount save1 = new SavingAccount( 2000 );
		SavingAccount save2 = new SavingAccount( 3000 );
		
		System.out.printf( "%s%14s%16s%n", "Mês", "Save1", "Save2" );
		
		System.out.printf( "%2d%,15.2f%,16.2f%n", 1, 
				save1.getSavingBalance(), save2.getSavingBalance() );
		
		SavingAccount.modifyInterestRate( 4 );
		
		for( int month = 2; month <= 12; month++ )
			System.out.printf( "%2s%15s%16s%n", month, save1, save2);
	}

}
