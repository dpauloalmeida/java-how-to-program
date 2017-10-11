package Cap5_12;

public class Main
{
	public static void main( String[] args )
	{
		int prod = 1;
		
		for( int i = 1; i <= 15; i++ )
		{
			if( i % 2 == 1 )
				prod *= i;
		}
		
		System.out.printf( "Porduto dos números ímpares: %d%n", prod );
	}
}
