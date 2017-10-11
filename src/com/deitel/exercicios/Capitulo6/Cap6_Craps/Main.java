package Cap6_Craps;


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
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		BankRoll myBankRoll = new BankRoll( 1000 );
		RandomMessage myMessage = new RandomMessage();		
		
		while( myBankRoll.getBankBalance() > 0 )
		{
			int myPoint = 0;
			Status gameStatus;
			
			System.out.print( "Enter to warge: " );
			double warge = input.nextDouble();
			
			while( warge > myBankRoll.getBankBalance() )
			{
				System.out.printf( "Value large what your bankroll: %.2f%n", myBankRoll.getBankBalance() );
				
				System.out.print( "Enter to warge: " );
				warge = input.nextDouble();
			}
			
			int sumOfDice = rollDice();
			
			switch( sumOfDice )
			{
				case SEVEN:
				case YO_LEVEN:
					gameStatus = Status.WON;
					myBankRoll.creditBankRoll( warge );
					break;
					
				case SNAKE_EYES:
				case TREY:
				case BOX_CARS:
					gameStatus = Status.LOST;
					myBankRoll.debitBankRoll( warge );
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
				
				if( sumOfDice == myPoint )
				{
					gameStatus = Status.WON;
					myBankRoll.creditBankRoll( warge );
				}
				else if( sumOfDice == SEVEN )
				{
					gameStatus = Status.LOST;
					myBankRoll.debitBankRoll( warge );
				}
			}
			
			int msg = 1 + randomNumbers.nextInt( 3 );
			myMessage.msg( msg );
			
			System.out.printf( "Bank balance now: %.2f%n%n", myBankRoll.getBankBalance() );
		}
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
