package Cap6_9;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to number: " );
		double number = input.nextDouble();
		
		double y = Math.floor( number + 0.5 );
		
		System.out.printf( "Número arredondado: %.2f%n", y );
	}

}
