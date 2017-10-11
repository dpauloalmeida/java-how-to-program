package Cap8_12;


public class Main
{

	public static void main( String[] args )
	{	
		DateAndTime myDateAndTime = new DateAndTime( 16, 4, 2017, 0, 0, 0 );

		for( int i = 0; i < 100000; i++ )
		{
			myDateAndTime.tick(); // pasa os segundos
				
			System.out.printf( "%s   %s%n", myDateAndTime, myDateAndTime.toDate()  );
		}
	}
	
}
