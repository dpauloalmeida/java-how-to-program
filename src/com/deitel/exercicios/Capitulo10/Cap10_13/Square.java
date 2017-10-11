package Cap10_13;

public class Square extends TwoDimensionalShape
{
	private double l;
	
	// contrutor
	public Square( double l )
	{
		if( l < 0 )
			throw new IllegalArgumentException(
					"Lado out-of-range" );
		
		this.l = l;
	}
	
	public void setL( double l )
	{
		if( l < 0 )
			throw new IllegalArgumentException(
					"Lado out-of-range" );
		
		this.l = l;
	}
	
	public double getL()
	{
		return l;
	}
	
	@Override
	public double getArea()
	{
		return getL() * getL();
	}
	
	public String toString()
	{
		return String.format( "%s", "É um quadrado" );
	}
	
}
