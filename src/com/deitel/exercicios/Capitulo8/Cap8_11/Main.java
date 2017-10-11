package Cap8_11;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		Complex myComplex2 = new Complex( 4, -4, -2, -5 );
		
		System.out.printf( "1 - Soma%n2 - Subtração%n? " );
		int choice = sc.nextInt();

		switch( choice )
		{
			case 1:
				myComplex2.sumeTwoNumbers();
					
				System.out.printf( "%n%s%12s%n", "Real", "Imaginario" );
				System.out.println( myComplex2 );
				break;
			case 2:
				myComplex2.subtractionTwoNumbers();
				
				System.out.printf( "%n%s%12s%n", "Real", "Imaginario" );
				System.out.println( myComplex2 );
				break;
			default:
				System.out.println( "*** Inválido ***" );	
		}
		
		System.out.println( "Encerrando..." );
	}

}
