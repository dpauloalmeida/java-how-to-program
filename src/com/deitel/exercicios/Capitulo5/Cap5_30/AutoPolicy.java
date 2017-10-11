package Cap5_30;


public class AutoPolicy
{
	private int accountNumber;
	private String makeAndModel;
	private String state;

	public AutoPolicy( int accountNumber, String makeAndModel, String state )
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	public void setAccountNumber( int accountNumber )
	{
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setMakeAndModel( String makeAndModel )
	{
		this.makeAndModel = makeAndModel;
	}

	public String getMakeAndModel()
	{
		return makeAndModel;
	}

	public void setState( String state )
	{
		if( state == "CT" || state == "MA" || state == "ME" || state == "NH" ||
				state == "NJ" || state == "NY" || state == "PA" || state == "VT" )
		{
		this.state = state;
		}
		else
			System.out.println( "*** Erro ***" );
	}

	public String getState()
	{
		return state;
	}

	public boolean isNofaultState()
	{
		boolean noFaultState;

		switch ( getState() )
		{
			case "MA":
			case "NJ":
			case "NY":
			case "PA":
				noFaultState = true;
				break;

			default:
				noFaultState = false;
				break;
		}

		return noFaultState;
	}
}
