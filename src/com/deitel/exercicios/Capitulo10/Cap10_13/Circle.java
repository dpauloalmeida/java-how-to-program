package Cap10_13;

public class Circle extends TwoDimensionalShape
{
	private final double PI = 3.14;
	private double r;
	
	// construtor
	public Circle( double r )
	{
		if( r < 0 )
			throw new IllegalArgumentException(
					"Raio out-of-range" );
		
		this.r = r;
	}
	
	public void setR( double r )
	{
		if( r < 0 )
			throw new IllegalArgumentException(
					"Raio out-of-range" );
		
		this.r = r;
	}
	
	public double getR()
	{
		return r;
	}
	
	public double getPI()
	{
		return PI;
	}
	
	@Override
	public double getArea()
	{
		return getPI() * ( getR() * getR() );
	}
	
	public String toString()
	{
		return String.format( "%s", "É um circulo!" );
	}
	
}
