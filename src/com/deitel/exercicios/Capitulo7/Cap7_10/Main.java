package Cap7_10;


public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int[] counts = new int[ 11 ];
		
		ComissionSales myComission = new ComissionSales( counts );
		
		for( int i = 1; i < counts.length; i++ )
		{
			System.out.print( "Enter to value: " );
			myComission.setValue( sc.nextDouble() );
			
			myComission.frequencyComission();
			
			
			System.out.println(  );
		}
		
		printData( counts );
	}
	
	public static void printData( int[] count )
	{
		System.out.println( "Results Week" );
		
		for( int i = 1; i < count.length; i++ )
		{
			if( i == 10 )
				System.out.printf( "R$%4d e acima ", i * 100 );
			else
				System.out.printf( "R$%d-%d ", i * 100, i * 100 + 99 );
			
			for( int stars = 0; stars < count[ i ]; stars++ )
				System.out.print( "*" );
			
			System.out.println();
		}
	}

}
