package Cap5_13;


public class Main
{
	public static void main( String[] args )
	{
		System.out.printf( "%s%25s%n", "!n", "Resultado" );
		
		for ( int i = 1; i <= 20; i++ )
		{
			long fat = 1;
			
			System.out.printf( "%2d", i );
			
			for ( int j = 1; j <= i; j++ )
			{
				fat *= j;
			}
			
			System.out.printf( "%25d%n", fat );
		}
	}
}
