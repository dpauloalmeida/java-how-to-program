package Cap7_14;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int[] number = new int[ 4 ];
		int pass = 0;
		
		System.out.printf( "Enter to  four numbers: " );
		number[ pass++ ] = sc.nextInt();
		
		while( pass != 4 )
		{
			System.out.printf( "Enter to four number: " );
			number[ pass++ ] = sc.nextInt();
		}
		
		System.out.println( product( number[ 0 ], number[ 1 ] ) );
		System.out.println( product( number[ 0 ], number[ 1 ], number[ 2 ] ) );
		System.out.println( product( number[ 0 ], number[ 1 ], number[ 2 ], number[ 3 ] ) );
	}

	public static double product( double... numbers)
	{
		double result = 1;
		
		System.out.println( "The product of the numbers is:" );
		
		for( double x : numbers )
			result *= x;
		
		return result;
	}
	
}
