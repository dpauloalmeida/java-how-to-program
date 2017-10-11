package Cap8_6;

public class SavingAccount
{
	static double annualInterestRate;
	
	private double savingBalance;
	
	// constructor
	public SavingAccount()
	{
		this( 0 );
	}
	
	public SavingAccount( double savingBalance )
	{
		if( savingBalance < 0 )
			throw new IllegalArgumentException( "savingBalance (" + savingBalance + 
												") out-of-range specifield" );
		this.savingBalance = savingBalance;

	}

	public double getSavingBalance()
	{
		return savingBalance;
	}
	
	public double calculeMonthInterest()
	{
		savingBalance += getSavingBalance() * annualInterestRate / 12;
		
		return getSavingBalance();
	}
	
	public static void modifyInterestRate( double value )
	{
		annualInterestRate = value;
	}
	
	public String toString()
	{
		return String.format( "%,.2f", calculeMonthInterest() );
	}
}
