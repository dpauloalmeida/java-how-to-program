package Cap8_17;


import java.security.SecureRandom;

public class Main
{
	private static final int SIZE = 3;
	
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		TicTacToe myTacToe = new TicTacToe();
		
		SecureRandom random = new SecureRandom();
		
		
		do
		{
			do
			{
				System.out.print( "Jodador 1 linha: " );
				myTacToe.setPlayRow( sc.nextInt() );
				
				System.out.print( "Jodador 1 coluna: " );
				myTacToe.setPlayColumn( sc.nextInt() );
			
			} while( myTacToe.played( 'x' ) != true );
			
			if( myTacToe.testWon() == true)
				break;
			
			do
			{
				myTacToe.setPlayRow( 0 + random.nextInt( 3 ) );
				System.out.println( "Jodador 2 linha: " + myTacToe.getPlayRow() );
				
				myTacToe.setPlayColumn( 0 + random.nextInt( 3 ) );
				System.out.println( "Jodador 2 coluna: " + myTacToe.getPlayColumn() );
			
			} while( myTacToe.played( 'o' ) != true );
	
		} while( myTacToe.testWon() != true );
		
		
		System.out.printf( "%n%n Jogo da Velha%n" );
		myTacToe.displayArray();
	}

}
