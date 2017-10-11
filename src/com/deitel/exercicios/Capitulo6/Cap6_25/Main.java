package Cap6_25;

public class Main
{

	public static void main( String[] args )
	{
		for( int i = 1; i <= 1000; i ++ )
		{
			int count = 0;
			
			for( int j = 1; j <= i; j++ )
			{
				if( i % j == 0 )
					++count;
			}
			
			if( count == 2 )
				System.out.printf( "The number %d is primo%n", i );
		}
	}

}
