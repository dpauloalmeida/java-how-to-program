package Cap14_11;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to phase: " );
		String s1 = sc.nextLine();
		
		System.out.print( "Enter to index: " );
		String s2 = sc.nextLine();
		
		char c = s2.charAt( 0 );
		int count = 0;
		int hold = 0;
		
		for( int i = 0; i < s1.length(); i++ ) {
			
			if( s1.indexOf( c, hold ) >= 1 ) {
				
				++count;
				hold = s1.indexOf( c, hold ) + 1;
			}
		}
		
		System.out.println( count );
	}

}
