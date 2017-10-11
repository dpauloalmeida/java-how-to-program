package Cap6_29;


import java.security.SecureRandom;

public class Main
{
	private static final SecureRandom randomNumber = new SecureRandom();

	private enum Coin { HEADS, TAILS };
	
	public static void main( String[] args )
	{
		Coin sideCoin = null;
		
		int head = 0;
		int tail = 0;
		
		for( int i = 0; i < 100; i++ )
		{
			int number = randomNumber.nextInt( 2 );
			
			switch( number )
			{
				case 0:
					sideCoin = Coin.HEADS;
					break;
				case 1:
					sideCoin = Coin.TAILS;
					break;
			}
			
			if( sideCoin == Coin.HEADS )
				++head;
			else
				++tail;
		}
		
		System.out.println( "Heads\tTails" );
		System.out.printf( " %d\t% d%n", head, tail );
	}

}
