package Cap6_17;

public class Main
{
	
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to number: " );
		int number = input.nextInt();
		
		System.out.printf( "The number is Even? %s%n", isEven( number ) );
	}
	
	public static boolean isEven( int number )
	{
		return number % 2 == 0;
	}
	
}
