package Cap14_8;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );

		System.out.print( "Enter to phone: " );
		String phone = sc.nextLine();
		
		String[] code = phone.split( "\\D" );
		
		StringBuilder concat = new StringBuilder( 15 );
		
		for( String tokens : code )
			concat.append( tokens );
		
		System.out.println( concat );
	}

}
