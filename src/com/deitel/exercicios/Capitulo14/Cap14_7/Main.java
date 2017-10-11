package Cap14_7;


import java.util.StringTokenizer;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );

		System.out.print( "Enter to string: " );
		String s1 = sc.nextLine();
		
		String[] tokens = s1.split( " " );
		
		for( String token : tokens ) {
			System.out.print( token.substring( 1 ) + Character.toLowerCase( token.charAt( 0 ) ) + "yo" );
			System.out.print( " " );
		}
	}

}
