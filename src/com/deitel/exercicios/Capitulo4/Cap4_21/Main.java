package Cap4_21;


public class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		int counter = 0;
		int number;
		int largest1 = 0;
		int largest2 = 0;
		int largest3 = 0;
		
		while( counter < 5 )
		{
			System.out.print( "Informe o número: " );
			number = input.nextInt();
			
			if( number > largest1 )
			{
				largest3 = largest2;
				largest2 = largest1;
				largest1 = number;
			}
			else if( number > largest2 )
			{
				largest3 = largest2;
				largest2 = number;
			}
			else if( number > largest3 )
				largest3 = number;

			++counter;
		}
		
		System.out.printf( "1º maior número: %d%n", largest1 );
		System.out.printf( "2º maior número: %d%n", largest2 );
		System.out.printf( "3º maior número: %d%n", largest3 );
	}
}
