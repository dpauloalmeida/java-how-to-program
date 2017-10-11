package Cap11_19;

public class SumeClass
{
	private int number1, number2;
	
	public SumeClass( int number1, int number2 ) 
	{
		if( number1 < 0 || number1 > 100 )
			throw new IllegalArgumentException( "Erro: " + number1 );
		
		if( number2 < 0 || number2 > 100 )
			throw new IllegalArgumentException( "Erro: " + number2 );
			
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int getNumber1()
	{
		return number1;
	}
	
	public int getNumber2()
	{
		return number2;
	}
	
	public int getSum()
	{
		return getNumber1() + getNumber2();
	}
	
	public String toString()
	{
		return String.format( "%s: %d", "Soma", getSum() );
	}
}
