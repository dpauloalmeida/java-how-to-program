package Cap6_26;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to number: " );
		int number = input.nextInt();
		
		invertDigits( number );
		
	}

	public static void invertDigits( int number )
	{
		do
		{
			int mod = number % 10;
			number = number / 10;

			System.out.print( mod );
			
		} while (number != 0);
	}
}
