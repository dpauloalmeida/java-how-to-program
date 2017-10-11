package Cap6_36;


import java.security.SecureRandom;

public class Main
{
	
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		SecureRandom randomNumber = new SecureRandom();
		
		int number1 = 0 + randomNumber.nextInt( 10 );
		int number2 = 0 + randomNumber.nextInt( 10 );
		
		question( number1, number2 );
		int result = input.nextInt();
		
		while( result != - 1 )
		{
			if( result == ( number1 * number2 ) )
			{
				System.out.println( "Muito bem!\n" );
				
				number1 = 0 + randomNumber.nextInt( 10 );
				number2 = 0 + randomNumber.nextInt( 10 );
				question( number1, number2 );
			}
			else
			{
				System.out.println( "Tente novamente!\n" );
				
				question( number1, number2 );
			}
				
			result = input.nextInt();
		}

		System.out.println( "Encerrando..." );
	}
	
	public static void question( int number1, int number2 )
	{
		System.out.printf( "Quanto é %d vezes %s? ", number1, number2 );
	}
}
