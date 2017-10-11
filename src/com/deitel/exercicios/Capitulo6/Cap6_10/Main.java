package Cap6_10;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		RoundedNumbers myRounded = new RoundedNumbers();
		
		System.out.print( "Enter to number: " );
		double number = input.nextDouble();
		
		myRounded.setNumber( number );
		
		System.out.printf( "Round Integer: %.2f%n", myRounded.getNumber() );
		System.out.printf( "Round Tenths: %.2f%n", myRounded.roundToTenths() );
		System.out.printf( "Round Hundredths: %.2f%n", myRounded.roundToHundreths() );
		System.out.printf( "Round Thousandths: %.2f%n", myRounded.roundToThousandths() );
	}

}
