package Cap10_13;

public class Triangle extends TwoDimensionalShape
{
	private double height;
	private double base;
	
	// construtor
	public Triangle( double height, double base )
	{
		if( height < 0 )
			throw new IllegalArgumentException(
					"Heigth out-of-range" );
		
		if( base < 0 )
			throw new IllegalArgumentException(
					"Base out-of-range" );
		
		this.height = height;
		this.base = base;
	}
	
	public void setHeight( double height )
	{
		if( height < 0 )
			throw new IllegalArgumentException(
					"Heigth out-of-range" );
		
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setBase( double base )
	{
		if( base < 0 )
			throw new IllegalArgumentException(
					"Base out-of-range" );
		
		this.base = base;
	}
	
	public double getBase()
	{
		return base;
	}
	
	@Override
	public double getArea()
	{
		return getBase() * getHeight() / 2;
	}
	
	public String toString()
	{
		return String.format( "%s", "É um triangulo" );
	}
	
}
