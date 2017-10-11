package Cap6_20;


public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );

		
		System.out.print( "Enter to radius: " );
		double radius = input.nextDouble();
		
		System.out.printf( "The area is: %.2f%n", circleArea( radius ) );
	}
	
	public static double circleArea( double radius )
	{
		return Math.PI * Math.pow( radius, 2 );
	}

}
