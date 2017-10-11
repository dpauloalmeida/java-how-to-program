package Cap7_22b;

public class Main
{
	private static int SIZE = 8;
	
	public static void main( String[] args )
	{
		int[][] board = new int[ SIZE ][ SIZE ];
		int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };
		
		WalkingHorse myWalkingHorse = new WalkingHorse( board, horizontal, vertical, 0, 0 );

		int mov = 0;
		
		
		for( int i = 0; i <= 10000; i++ )
		{
			myWalkingHorse.setMoveNumber( mov );
			System.out.printf( "Movimento: %d%n", mov );
			myWalkingHorse.processWakkingHorse();
			
			++mov;
			
			if( mov > 7 )
				mov = 0;
		}
		
		System.out.printf( "%n============ Tabuleiro ============%n" );
		myWalkingHorse.printArray();
	}	

}
