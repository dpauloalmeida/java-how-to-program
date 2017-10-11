package Cap6_16;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to first number: " );
		int number1 = input.nextInt();
		
		System.out.print( "Enter to seconde number: " );
		int number2 = input.nextInt();
		
		System.out.printf( "Multiple? %s", isMultiple( number1, number2) );
	}

	public static boolean isMultiple( int number1, int number2 )
	{
		boolean multiple = true;
		
		for( int i = 0; i < number2; i++ )
		{
			if( ( number1 * i ) == number2 )
			{
				multiple = true;
				
				break;
			}
			else
				multiple = false;
		}

		return multiple;
	}
	
}
