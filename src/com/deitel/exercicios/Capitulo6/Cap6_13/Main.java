package Cap6_13;


import java.security.SecureRandom;

public class Main
{
	
	public static void main( String[] args )
	{
		SecureRandom randomNumbers = new SecureRandom();
		
		for( int i = 0; i < 5; i++ )
		{
			int number = 6 + 4 * randomNumbers.nextInt( 5 );
			
			System.out.printf( "%d ", number );
		}
	}
	
}
