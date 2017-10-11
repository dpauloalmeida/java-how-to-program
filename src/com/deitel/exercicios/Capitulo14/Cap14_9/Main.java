package Cap14_9;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to phase: " );
		String s1 = sc.nextLine();
		
		String[] token = s1.split( " " );

		for( String tokens : token )
		{
			for( int i = tokens.length() - 1; i >= 0; i-- )
			{
				System.out.print( tokens.charAt( i ) );
			}
			System.out.print( " " );
		}
	}

}
