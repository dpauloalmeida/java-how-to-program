package Cap6_30_31;


import java.security.SecureRandom;

public class Main
{
	private static final SecureRandom randomNumber = new SecureRandom();
	
	
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		int random = 1 + randomNumber.nextInt( 1000 );
		
		int count = 0;
		
		System.out.print( "Enter to number: " );
		int number = input.nextInt();
		
		while( number != random )
		{
			gess( number, random );
			
			System.out.print( "Enter to number: " );
			number = input.nextInt();
			
			++count;
		}
		
		if( count < 10 )
			System.out.printf( "Either you know the secret or you get luck!%nTentativas: %d%n", count );
		else if( count == 10 )
			System.out.println( "You know the secret!" );
		else
			System.out.println( "You should be able to do better!" );
	}

	public static void gess( int number, int random )
	{
		if( number > random )
			System.out.println( "Too high, try again!" );
		else if( number < random )
			System.out.println( "Too low, try again!" );
	}
	
}
