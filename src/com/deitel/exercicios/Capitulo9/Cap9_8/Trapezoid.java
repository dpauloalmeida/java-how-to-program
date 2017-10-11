package Cap9_8;

public class Trapezoid extends Quadrilateral
{
	private double hieght;
	
	public Trapezoid( double x, double y, double hieght )
	{
		super( x, y );
		
		if( hieght < 0 )
			throw new IllegalArgumentException( 
					"Hieght out-of-range specified" );
		
		this.hieght = hieght;
	}
	
	public Trapezoid( double x, double y )
	{
		super( x, y );
	}
	
	public void setHieght( double hieght )
	{
		this.hieght = hieght;
	}
	
	public double getHieght()
	{
		return hieght;
	}
	
	public double areaT()
	{
		return ( super.getX() + super.getY() ) * getHieght() / 2;
	}
	
	@Override
	public String toString()
	{
		return String.format( "%s: %.2f", "Trapezio", areaT() );
	}
}
