package Cap7_22b;

public class WalkingHorse
{
	private int[][] board;
	private int[] horizontal;
	private int[] vertical;
	private int currentRow;
	private int currentColumn;
	
	private int countMove = 0;
	
	private int moveNumber;
	
	public WalkingHorse( int[][] board, int[] horizontal, int[] vertical,
			int currentRow, int currentColumn )
	{
		this.board = board;
		this.horizontal = horizontal;
		this.vertical = vertical;
		this.currentRow = currentRow;
		this.currentColumn = currentColumn;
	}
	
	public void setMoveNumber( int moveNumber )
	{
			this.moveNumber = moveNumber;
	}
	
	public void processWakkingHorse()
	{
		if( testMoveOutBoard() && testMoveSquare() )
		{		
				currentRow += vertical[ moveNumber ];
				currentColumn += horizontal[ moveNumber ];
				
				++countMove;
				
				board[ currentRow ][ currentColumn ] = countMove;
		}
		else
			System.out.printf( "Tente outro movimento!%n%n" );
	}
	
	public boolean testMoveSquare()
	{	
		int testRow = currentRow + vertical[ moveNumber ];
		int testColumn = currentColumn + horizontal[ moveNumber ];
		
		if( board[ testRow ][ testColumn ] == 0 )
			return true;
		else
			return false;
	}
	
	public boolean testMoveOutBoard()
	{
		boolean testRow;
		boolean testColumn;
		
		// teste linha para cavalo não sair do tabuleiro
		if( currentRow + vertical[ moveNumber ] > 7 )
			testRow = false;
		else if( currentRow + vertical[ moveNumber ] < 0 )
			testRow = false;
		else 
			testRow = true;
		
		// teste coluna para cavalo não sai do tabuleiro
		if( currentColumn + horizontal[ moveNumber ] > 7 )
			testColumn = false;
		else if( currentColumn + horizontal[ moveNumber ] < 0 )
			testColumn = false;
		else 
			testColumn = true;
		
		return ( testRow && testColumn );
	}
	
	public void printArray()
	{
		for( int[] x : board )
		{
			for( int boards : x )
			{
				if( boards > 0 )
					System.out.printf( "%4d", boards );
				else if ( boards == 0 )
					System.out.printf( "%4s", "x" );
			}
			
			System.out.printf( "%n%n" );
		}
		
		System.out.printf( "Contador de movimento: %d%n", countMove );
	}
	
}
