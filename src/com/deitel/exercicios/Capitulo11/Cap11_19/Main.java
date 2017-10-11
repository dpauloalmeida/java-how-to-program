package Cap11_19;

public class Main
{

	public static void main( String[] args )
	{
		
		try
		{
			SumeClass sum = new SumeClass( 2, 5 );
			
			System.out.println( sum );
		}
		catch( IllegalArgumentException e )
		{
			System.out.println( e.getMessage() );
		}


	}

}
