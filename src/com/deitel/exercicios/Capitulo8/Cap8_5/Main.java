package Cap8_5;

public class Main
{

	public static void main( String[] args )
	{
		Time t1 = new Time();

		for( int i = 0; i < 1000000; i++ )
		{
			displayTime( t1 );
		}
	}

	private static void displayTime( Time time )
	{
		System.out.printf( "  %s%n%n", time.toString() );
	}
}
