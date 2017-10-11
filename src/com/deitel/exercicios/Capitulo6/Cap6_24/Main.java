package Cap6_24;

public class Main
{

	public static void main( String[] args )
	{
		isPerfect();
		
		System.out.println( "Encerrando..." );
	}
	
	public static void isPerfect()
	{

		for( int i = 1; i <= 1000; i++ )
		{
			int numberPerfect = 0;
			
			for( int j = 1; j <= i; j++ )
			{
				if( i % j == 0 && i != j )
					numberPerfect += j;
			}
			
			if( numberPerfect == i )
				System.out.printf( "%d is a perfect number!%n", i );
		}
	}

}
