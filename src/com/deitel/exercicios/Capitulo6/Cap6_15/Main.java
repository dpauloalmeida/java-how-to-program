package Cap6_15;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		System.out.print( "Enter to side 1: " );
		double side1 = input.nextDouble();
		
		System.out.print( "Enter to side 2: " );
		double side2 = input.nextDouble();
		
		System.out.printf( "The hypotenuse is: %.2f%n", hypotenuse( side1, side2 ) );
	}
	
	public static double hypotenuse( double side1, double side2 )
	{
		double hypot = 0;
		
		hypot = Math.pow( side1, 2 ) + Math.pow( side2, 2 );
		
		return Math.sqrt( hypot );
	}

}
