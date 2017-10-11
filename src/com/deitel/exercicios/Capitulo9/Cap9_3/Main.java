package Cap9_3;

public class Main
{

	public static void main( String[] args )
	{
		ComissionEmployee myEmployee = new ComissionEmployee( 
				"Danilo", "Almeida", "17", 300, 0.04 );
		
		BaseCommissionEmployee myEmployee2 = new BaseCommissionEmployee(
				5000, myEmployee );
		
		System.out.println( myEmployee2 );

	}

}
