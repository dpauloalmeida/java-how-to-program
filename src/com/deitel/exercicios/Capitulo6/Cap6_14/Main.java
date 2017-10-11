package Cap6_14;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to base number: " );
		int base = input.nextInt();
		
		System.out.print( "Enter to exponent number: " );
		int exponent = input.nextInt();
		
		System.out.printf( "Resultado: %d", integerPower( base, exponent ) );
	}
	
	public static int integerPower( int base, int exponent )
	{
		int result = base;
		
		for( int i = 0; i < exponent; i++ )
		{
			result *= base;
		}
		
		return result;
	}

}
