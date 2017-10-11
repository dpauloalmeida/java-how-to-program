package Cap6_21;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to number: " );
		int number = input.nextInt();
		
		System.out.println( );
		
		displayDigits( number, numberDigits( number ) );
	}

	public static void displayDigits( int number, int digits )
	{
		int resto;
		int div;
		int i = 0;
		int mod = ( int )Math.pow( 10, digits - 1 );
		
		do
		{
			resto = number % mod;
			div = number / mod;
			mod = mod / 10;
			
			number = resto;
			
			System.out.printf( "%d ", div );
			
			++i;
			
		} while ( i < digits );
	}
	
	public static int numberDigits( int number )
	{
		int i = 0;
		
		do
		{
			number = number / 10;
			
			++i;
			
		} while( number != 0 );
		
		return i;
	}
	
}
