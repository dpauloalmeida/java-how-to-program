package Cap6_8;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Informe o tempo: " );
		float time = input.nextFloat();
		
		System.out.printf( "Valor: R$%,.2f%n%n", calculateCharges( time ) );
	}
	
	// calcula taxa de estacionamento a ser pago
	public static double calculateCharges( float time )
	{
		double rate = 0;
		
		if( time <= 3 )
			rate = 2;
		else if( time > 3 && time < 24 )
			rate = 2 + ( ( time - 3 ) * 0.50 );
		else if( time >= 24 )
			rate = 10 + ( ( time - 24 ) * 0.50 );
		
		return rate;
	}

}
