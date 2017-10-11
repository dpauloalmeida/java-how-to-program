package com.deitel.exercicios.Capitulo14.Cap14_20;

public class Main
{
	static final int SIZE = 8;
	
	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );

		System.out.print( "Enter to value: " );
		String value = sc.next();
		
		StringBuilder valueFill = new StringBuilder();
		
		if( value.length() < 8 ) {
			
			int dif = 8 - value.length();
			
			for( int i = 0; i < dif; i++ )
				valueFill.append( "*" );
			
			valueFill.append( value );
		}
		else
			valueFill.append( value );
		
		System.out.println( valueFill );
	}

}
