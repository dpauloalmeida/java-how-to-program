package Cap7_16;

public class Main
{

	public static void main( String[] args )
	{
		int arrayLength = Integer.parseInt( args[ 0 ] );
		double[] array = new double[ arrayLength ];
		
		double initialValue = Double.parseDouble( args[ 1 ] );
		double increment = Double.parseDouble( args[ 2 ] );
		
		double total = 0;
		
		for( int i = 0; i < array.length; i++ )
			array[ i ] = initialValue + increment * i;
		
		for( double y : array )
			total += y;
		
		System.out.printf( "The total is: %.2f", total );
	}

}
