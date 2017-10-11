package Cap14_13;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to phase: " );
		String s1 = sc.nextLine();
		
		String[] tokens = s1.split( " " );
		
		for( String token: tokens )
		{
			String hold = token.substring( token.length() - 2, token.length() );
			
			if( hold.equals( "ed" ) )
				System.out.println( token );
		}

	}

}
