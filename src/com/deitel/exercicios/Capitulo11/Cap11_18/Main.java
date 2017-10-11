package Cap11_18;

import Cap11_17.ExceptionA;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		
		int exception;
		
		try
		{
			System.out.print( "Informe um valor de 1 a 5: " );
			exception = sc.nextInt();
			
			if( exception < 1 || exception > 5 )
				throw new Exception( "Exception" );
			
			System.out.print( "Informe um valor de 6 a 10: " );
			exception = sc.nextInt();
			
			if( exception < 6 || exception > 10 )
				throw new RuntimeException( "RuntimeException" );
			
			System.out.print( "Informe um valor maior que 0: " );
			exception = sc.nextInt();
			
			if( exception <= 0 )
				throw new IllegalArgumentException( "IllegalArgumentException" );
		}
		catch( IllegalArgumentException e )
		{
			System.out.println(  );
		}
		catch( RuntimeException e )
		{
			System.out.println( e.getMessage() );
		}
		catch( Exception e )
		{
			System.out.println( e.getMessage() );
		}
		

	}

}
