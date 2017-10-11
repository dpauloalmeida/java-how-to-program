package Cap14_15;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to word: " );
		String s1 = sc.next();
		
		System.out.print( "Enter: " );
		String s2 = sc.next();
		
		char c = s2.charAt( 0 );
		
		for( int i = 0; i < s1.length(); i++ ) {
			
			if( s1.charAt( i ) == c ) {
				
				System.out.println( i );
				break;
			}
		}
			
	}

}
