package Cap5_30;


public class Main
{
	public static void main( String[] args )
	{
		AutoPolicy policy = new AutoPolicy( 1, "Toyota Camry", "ME" );
		
		policyInNoFaultState( policy );
	}

	public static void policyInNoFaultState( AutoPolicy policy )
	{
		System.out.println( "The auto policy:" );
		System.out.printf( "Account #: %d%nCar: %s%nState %s %s a no-fault state%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
				( policy.isNofaultState() ? "is" : "is not") );	
	}
}
