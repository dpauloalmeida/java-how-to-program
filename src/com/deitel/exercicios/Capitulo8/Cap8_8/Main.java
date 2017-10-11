package Cap8_8;

public class Main
{

	public static void main( String[] args )
	{
		Date birth = new Date( 7, 24, 1949 );
		Date hire = new Date( 2, 29, 2020 );
		Employee myEmployee = new Employee( "Danilo", birth, hire );
		
		Date myDate = new Date( 4, 16, 2017 );
		
		for( int next = 0; next <= 1080; next++ )
		{
			myDate.nextDay( next );
			
			System.out.println( myDate );
		}	
	}

}
