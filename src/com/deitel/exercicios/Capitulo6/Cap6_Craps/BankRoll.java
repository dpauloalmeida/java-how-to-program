package Cap6_Craps;

public class BankRoll
{
	private double bankBalance;
	private double warge;
	
	public BankRoll( double bankBalance )
	{
		this.bankBalance = bankBalance;
	}
	
	public void setWarge( double warge )
	{
		this.warge = warge;
	}
	
	public double getWarge()
	{
		return warge;
	}
	
	public void debitBankRoll( double warge )
	{
		bankBalance -= warge;
	}
	
	public void creditBankRoll( double warge )
	{
		bankBalance += warge;
	}
	
	public double getBankBalance()
	{
		return bankBalance;
	}
}
