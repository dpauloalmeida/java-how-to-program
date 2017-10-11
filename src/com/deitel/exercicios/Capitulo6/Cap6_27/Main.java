package Cap6_27;


public class Main {

	public static void main(String[] args) 
	{
		java.util.Scanner input = new java.util.Scanner( System.in );

		System.out.print( "Enter to number1: ");
		int number1 = input.nextInt();
		
		System.out.print( "Enter to number2: ");
		int number2 = input.nextInt();
		
		System.out.printf( "The mmc is: %d%n", mdc( number1, number2 ) );
	}
	
	public static int mdc( int a, int b )
	{
		while( b != 0 )
		{
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}

}
