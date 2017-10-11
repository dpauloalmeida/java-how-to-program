package Cap11_20;

public class Main
{

	public static void main( String[] args )
	{
		try
		{
			sumeMethod1();
		}
		catch( Exception exception )
		{
			exception.printStackTrace();
		}
	}
	
	public static void sumeMethod1() throws Exception
	{
		try
		{
			sumeMethod2();
		}
		catch( Exception exception )
		{
			throw new Exception( "Method1", exception );
		}
	}
	
	public static void sumeMethod2() throws Exception
	{
		try
		{
			sumeMethod3();
		}
		catch( Exception exception )
		{
			throw new Exception( "Method2", exception );
		}
	}
	
	public static void sumeMethod3() throws Exception
	{
	
		throw new Exception( "Method3" );

	}

}
