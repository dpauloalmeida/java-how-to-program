package Cap14_5;

import java.security.SecureRandom;

public class Main
{

	public static void main( String[] args )
	{
		SecureRandom random = new SecureRandom();
		
		String[] article = { "the", "a", "one", "some", "any" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };
		
		StringBuilder s1 = new StringBuilder( 100 );
		
		s1.append( article[ random.nextInt( 5 ) ] )
		  .append( " " )
		  .append( noun[ random.nextInt( 5 ) ] )
		  .append( " " )
		  .append( verb[ random.nextInt( 5 ) ] )
		  .append( " " )
		  .append( preposition[ random.nextInt( 5 ) ] )
		  .append( " " )
		  .append( article[ random.nextInt( 5 ) ] )
		  .append( " " )
		  .append( noun[ random.nextInt( 5 ) ] )
		  .append( "." );
		
		char upper = s1.charAt( 0 );
		
		s1.setCharAt( 0, Character.toUpperCase( upper ) );
		
		System.out.println( s1 );
	}

}
