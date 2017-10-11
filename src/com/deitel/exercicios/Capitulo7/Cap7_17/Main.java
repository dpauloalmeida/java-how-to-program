package Cap7_17;


import java.security.SecureRandom;

public class Main
{

	public static void main( String[] args )
	{
		final int LENGTH = 36000;
		
		SecureRandom randomNumber = new SecureRandom();
		
		int[][] sumDial = new int[ 7 ][ 7 ];
		
		for( int i = 0; i < LENGTH; i++ )
		{
			int dial1 = 1 + randomNumber.nextInt( 6 );
			int dial2 = 1 + randomNumber.nextInt( 6 );
			
			++sumDial[ dial1 ][ dial2 ];
		}
		
		for( int i = 1; i < sumDial.length; i++ )
		{
			sumDial[ 0 ][ i ] = i;
			sumDial[ i ][ 0 ] = i;
		}		
		
		for( int[] x : sumDial )
		{
			for( int sumDials : x )
			{
				System.out.printf( "%5d", sumDials );
			}
			
			System.out.println(  );
		}
	}

}
