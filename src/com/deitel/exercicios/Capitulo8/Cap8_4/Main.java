package Cap8_4;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		Rectangle myRectangle = new Rectangle();
		
		System.out.print( "Enter to length: " );
		try
		{
			myRectangle.setLength( sc.nextDouble() );
		}
		catch( IllegalArgumentException e ) 
		{
			System.out.println( e.getMessage() );
		}
		
		System.out.print( "Enter to width: " );
		try 
		{
			myRectangle.setWidth( sc.nextDouble() );	
		}
		catch( IllegalArgumentException e )
		{
			System.out.println( e.getMessage() );
		}
		
		System.out.println( myRectangle );
	}

}
