package Cap7_21;

public class GraphicTurtle
{
	private int[][] floor;
	private int posicionRow;
	private int posicionColumn;
	private int posicionPen;
	private int posicionTurn;
	
	public GraphicTurtle( int[][] floor, int posicionRow, int posicionColumn,
			int posicionPen, int posicionTurn )
	{
		this.floor = floor;
		
		this.posicionPen = posicionPen;
		this.posicionTurn = posicionTurn;
		
		if( posicionRow < 0 )
			this.posicionRow = 0;
		else if( posicionRow > 11 )
			this.posicionRow = 11;
		else
			this.posicionRow = posicionRow;
		
		if( posicionColumn < 0 )
			this.posicionColumn = 0;
		else if( posicionColumn > 11 )
			this.posicionColumn = 11;
		else
			this.posicionColumn = posicionColumn;
	}
	
	public void setPosicionRow( int posicionRow )
	{
		if( posicionRow < 0 )
			this.posicionRow = 0;
		else if( posicionRow > 11 )
			this.posicionRow = 11;
		else
			this.posicionRow = posicionRow;
	}
	
	public void setPosicionColumn( int posicionColumn )
	{
		if( posicionColumn < 0 )
			this.posicionColumn = 0;
		else if( posicionColumn > 11 )
			this.posicionColumn = 11;
		else
			this.posicionColumn = posicionColumn;
	}
	
	public void setPosicionPen( int posicionPen )
	{
		this.posicionPen = posicionPen;
	}
	
	public void setPosicionTurn( int posicionTurn )
	{
		this.posicionTurn = posicionTurn;
	}
	
	public void processTurtle( int size )
	{
		if(	posicionPen == 1 ) // caneta para cima
		{
			if( posicionTurn == 1 )
			{	// soma posição atual com a posição avançada
				posicionColumn += size - 1;
				
				// se posição somada for maior que array
				if( posicionColumn > 19 )
					posicionColumn = 19;
			}
			else if( posicionTurn == 2 )
			{	// soma posição atual com a posição avançada
				posicionRow += size - 1;
				
				// se posição somada for maior que array
				if( posicionRow > 19 )
					posicionRow = 19;
			}
			else if( posicionTurn == 3 )
			{	// soma posição atual com a posição avançada
				posicionColumn -= size + 1;
				
				// se posição somada for maior que array
				if( posicionColumn < 0 )
					posicionColumn = 0;
			}
			else if( posicionTurn == 4 )
			{	// soma posição atual com a posição avançada
				posicionRow -= size + 1;
				
				// se posição somada for maior que array
				if( posicionRow < 0 )
					posicionRow = 0;
			}
		}
		else // caneta para baixo
		{
			if( posicionTurn == 1 )
			{	
				size += posicionColumn;
				
				// se posição somada for maior que array
				if( size > 20 )
					size = 20;
				
				for( int i = posicionColumn; i < size; i++ )
					floor[ posicionRow ][ i ] = 1;
				
				posicionColumn = size - 1; // atualiza posição
			}
			else if( posicionTurn == 2 )
			{	
				size += posicionRow;
				
				// se posição somada for maior que array
				if( size > 20 )
					size = 20;
				
				for( int i = posicionRow; i < size; i++ )
					floor[ i ][ posicionColumn ] = 1;
				
				posicionRow = size - 1; // atualiza posição
			}
			else if( posicionTurn == 3 )
			{	
				size -= posicionColumn + 1; 
				
				// se posição subtração for menor que array
				if( size < 0 )
					size = 0;

				for( int i = posicionColumn; i >= size; i-- )
					floor[ posicionRow ][ i ] = 1;
				
				posicionColumn = size; // atualiza posição
			}
			else if( posicionTurn == 4 )
			{	
				size -= posicionRow + 1;
				
				// se posição subtração for menor que array
				if( size < 0 )
					size = 0;
				
				for( int i = posicionRow; i >= size; i-- )
					floor[ i ][ posicionColumn ] = 1;
				
				posicionRow = size; // atualiza posição
			}
		}
	}
	
	public void displayArray()
	{
		for( int[] x : floor )
		{
			for( int floors : x )
			{
				if( floors == 1 )
					System.out.printf( "%2s", "*" );
				else if( floors == 0 )
					System.out.printf( "%2s", " " );
			}
			
			System.out.println(); // nova linha
		}
	}
}
