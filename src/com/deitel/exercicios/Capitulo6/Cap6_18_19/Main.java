package Cap6_18_19;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );

		
		System.out.print( "Enter to side: " );
		int side = input.nextInt();
		
		System.out.print( "Enter to type char: " );
		char fill = input.next().charAt( 0 );
		
		System.out.println(  );
		
		squareOfAsterisks( side, fill );
	}
	
	public static void squareOfAsterisks( int side, char fill )
	{
		for( int i = 0; i < side; i++ )
		{
			
			for ( int j = 0; j < side; j++ )
			{
				System.out.print( fill );
				
			}
			System.out.println(  );
		}
	}

}
