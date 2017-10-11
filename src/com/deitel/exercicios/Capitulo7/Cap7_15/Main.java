package Cap7_15;

public class Main
{

	public static void main( String[] args )
	{
		int arrayLength = Integer.parseInt( args[ 0 ] );
		int[] array = new int[ arrayLength ];

		int initialValue = Integer.parseInt( args[ 1 ] );
		int increment = Integer.parseInt( args[ 2 ] );
		
		for( int i = 0; i < array.length; i++ )
			array[ i ] = initialValue + increment * i;
		
		System.out.printf( "%s%8s%n", "Index", "Value" );
		
		for( int counter = 0; counter < array.length; counter++ )
			System.out.printf( "%5d%8d%n", counter, array[ counter ] );

	}

}
