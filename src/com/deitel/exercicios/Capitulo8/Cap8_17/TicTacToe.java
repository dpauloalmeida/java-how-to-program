package Cap8_17;

public class TicTacToe
{
	enum Status { X, O, EMPTY };
	
	private Status[][] hash = new Status[ 3 ][ 3 ];
	
	private int playRow;
	private int playColumn;
	
	private int play1Win;
	private int play2Win;
	
	
	// constructor
	public TicTacToe()
	{
		for( int i = 0; i < hash.length; i++ )
		{
			for( int j = 0; j < hash.length; j++ )
				hash[ i ][ j ] = Status.EMPTY;
		}
	}
	
	// métodos sets
	public void setPlayRow( int playRow )
	{
		this.playRow = playRow;
	}
	
	public void setPlayColumn( int playColumn )
	{
		this.playColumn = playColumn;
	}
	
	// métodos gets
	public int getPlayRow()
	{
		return playRow;
	}
	
	public int getPlayColumn()
	{
		return playColumn;
	}
	
	public boolean played( char play )
	{
		if( hash[ playRow ][ playColumn ] == Status.EMPTY )
		{
			if( play == 'x')
				hash[ playRow ][ playColumn ] = Status.X;
			else
				hash[ playRow ][ playColumn ] = Status.O;
		}
		else
			return false;
		
		return true;
	}
	
	public boolean testWon()
	{
		for( int i = 0; i < hash.length; i++ )
		{
			play1Win = 0;
			play2Win = 0;
			
			for( int j = 0; j < hash.length; j++ )
			{
				if( hash[ i ][ j ] == Status.X )
				{
					++play1Win;
					
					if( play1Win == 3 )
					{
						System.out.printf( "%nJogador 1 Vence" );
						return true;
					}
				}
				else if( hash[ i ][ j ] == Status.O )
				{
					++play2Win;
					
					if( play2Win == 3 )
					{
						System.out.printf( "%nJogador s Vence" );
						return true;
					}
				}
			}
			
		}
		
		if( countEmpty() == true )
			return false;
		else
			return true;
	}
	
	public boolean countEmpty()
	{
		int count = 0;
		
		for( int i = 0; i < hash.length; i++ )
		{
			for( int j = 0; j < hash.length; j++ )
			{
				if( hash[ i ][ j ] == Status.EMPTY )
					++count;
			}
			
		}
		
		if( count > 0 )
			return true;
		else
			return false;
	}
	
	public void displayArray()
	{
		for( Status[] x : hash )
		{
			for( Status myHash : x )
			{
				if( myHash == Status.X )
					System.out.printf( " %3s", "X" );
				else if( myHash == Status.O )
					System.out.printf( " %3s", "O" );
				else
					System.out.printf( " %3s", " " );
			}
			
			System.out.println();
		}
	}
}
