package Cap14_18;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int[] freqLetter = new int[ 91 ];
		int[] freqNumberWord = new int[ 10 ];
		
		System.out.print( "Enter to text: " );
		String s1 = sc.nextLine();
		
		System.out.printf( "%n====== Ocorrências ======%n" );

		for( int i = 65; i <= 90; i++ ) {
			
			System.out.printf( "%c = ", i );
			
			for( int j = 0; j < s1.length(); j++ ) {
				
				if( s1.charAt( j ) == Character.toLowerCase( i ) || 
					s1.charAt( j ) == Character.toUpperCase( i ) )
					++freqLetter[ i ];
			}
			
			System.out.println( freqLetter[ i ] );
		}
		
		String[] tokens = s1.split( " " );
		
		for( int i = 0; i < tokens.length; i++ ) 	
			++freqNumberWord[ tokens[ i ].length() ];
		
		
		System.out.printf( "%n===== Ocorrências Palavras =====%n" );
		
		for( int i = 1; i < freqNumberWord.length; i++ ) 
			System.out.printf( "%d = %d%n", i, freqNumberWord[ i ] );

	}

}
