package Cap11_17;

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
				throw new ExceptionA( "Negado ExceptionA" );
			
			System.out.println( "Aprovado ExceptionA " );
		}
		catch( ExceptionA e )
		{
			System.out.println( e.getMessage() );
		}
		
		try
		{
			System.out.print( "Informe de 6 a 10: " );
			exception = sc.nextInt();
			
			if( exception < 6 || exception > 10 )
				throw new ExceptionB( "Negado ExceptionB" );
			
			System.out.println( "Aprovado ExceptionB" );
		}
		catch( ExceptionB e )
		{
			System.out.println( e.getMessage() );
		}
		
		try
		{
			System.out.print( "Informe um número maior ou igual a 0: " );
			exception = sc.nextInt();
			
			if( exception < 0 )
				throw new NullPointerException( "Negado NullPointerException" );
			
			System.out.println( "Aprovado NullPointerException" );
		}
		catch( NullPointerException e )
		{
			System.out.println( e.getMessage() );
		}

	}

}
