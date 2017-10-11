package Cap7_18;

import java.security.SecureRandom;

public class Main
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { CONTINUE, WON, LOST };
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main( String[] args )
	{	
		Status gameStatus;
		
		int[] wonOneDial = new int[ 21 ];
		int[] lostOneDial = new int[ 21 ];
		
		for( int i = 0; i < 1000000; i++ )
		{
			int myPoint = 0;
			
			int sumOfDice = rollDice();
			int count = 1;
			
			switch( sumOfDice )
			{
				case SEVEN:
				case YO_LEVEN:
					gameStatus = Status.WON;
					break;
					
				case SNAKE_EYES:
				case TREY:
				case BOX_CARS:
					gameStatus = Status.LOST;
					break;
					
				default:
					gameStatus = Status.CONTINUE;
					myPoint = sumOfDice;
					System.out.printf( "Point is %d%n", myPoint );
					break;
			}
			
			while( gameStatus == Status.CONTINUE )
			{
				sumOfDice = rollDice();
				++count;
				
				if( sumOfDice == myPoint )
				{
					gameStatus = Status.WON;
				}
				else if( sumOfDice == SEVEN )
				{
					gameStatus = Status.LOST;
				}
			}
			
			if( gameStatus == Status.WON )
			{
				System.out.println( "You Win!" );
				
				if( count <= 20)
					++wonOneDial[ count ];
			}
			else
			{
				System.out.println( "You Loser!" );
				
				if( count <= 20)
					++lostOneDial[ count ];
			}
		}
		
		printDatas myData = new printDatas( wonOneDial, lostOneDial );
		
		System.out.printf( "%n%n%s%8s%11s%n", "Dial", "Win", "Loser" );
		
		myData.displayPrint();
		
	}
	
	public static int rollDice()
	{
		int die1 = 1 + randomNumbers.nextInt( 6 );
		int die2 = 1 + randomNumbers.nextInt( 6 );
		
		int sum = die1 + die2;
		
		System.out.printf( "Player rolled %d + %d = %d%n",
				die1, die2, sum );
		
		return sum;
	}
}
