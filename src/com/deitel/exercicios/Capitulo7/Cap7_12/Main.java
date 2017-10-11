package Cap7_12;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int[] arrayNumbers = new int[ 5 ];
		int pass = 1;
		
		
		for( int i = 0; i < arrayNumbers.length; i++ )
		{
			int count = 0;
			
			System.out.print( "Enter to number: " );
			int number = sc.nextInt();
			
			if( i == 0 )
				arrayNumbers[ 0 ] = number;
			else
			{
				for( int j = 0; j < pass; j++ )
				{
					if( number == arrayNumbers[ j ] )
						++count;	
				}
				
				if( count == 0 )
					arrayNumbers[ pass++ ] = number;
			}
		}
		
		for( int k : arrayNumbers )
		{
			if( k != 0 )
				System.out.println( k );
		}	
	}

}
