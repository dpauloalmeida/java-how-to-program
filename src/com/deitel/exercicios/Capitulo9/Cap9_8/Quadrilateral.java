package Cap9_8;

public class Quadrilateral
{
	private double x;
	private double y;
	
	public Quadrilateral( double x, double y )
	{
		if( x < 0 )
			throw new IllegalArgumentException(
					"x out-of-range specified" );
		
		if( y < 0 )
			throw new IllegalArgumentException(
					"x out-of-range specified" );
		
		this.x = x;
		this.y = y;
	}
	
	public void setX( double x )
	{
		if( x < 0 )
			throw new IllegalArgumentException(
					"x out-of-range specified" );
		
		this.x = x;
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setY( double y )
	{
		if( y < 0 )
			throw new IllegalArgumentException(
					"x out-of-range specified" );
		
		this.y = y;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double areaQ()
	{
		return getX() * getY();
	}
	
	@Override
	public String toString()
	{
		return String.format( "%s: %.2f", "Quadrado", areaQ() );
	}
}
