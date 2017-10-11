package Cap6_28;

public class Main 
{

	public static void main(String[] args) 
	{
		java.util.Scanner input = new java.util.Scanner( System.in );

		System.out.print( "Enter to average: " );
		double average = input.nextDouble();
		
		System.out.printf( "Your points: %d%n", qualityPoints( average ) );
	}

	public static int qualityPoints( double average )
	{
		int points = -1;
		
		if( average >= 90 && average <= 100 )
			points = 4;
		else if( average >= 80 && average <= 89 )
			points = 3;
		else if( average >= 70 && average <= 79 )
			points = 2;
		else if( average >= 60 && average <= 69 )
			points = 1;
		else if( average >= 0 && average < 60 )
			points = 0;
		else
			System.out.println( "*** Inválido *** " );
		
		return points;
	}
	
}
