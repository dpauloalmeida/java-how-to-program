package Cap8_4;

public class Rectangle
{
	private double length;
	private double width;
	
	
	public Rectangle()
	{
		this( 1, 1 );
	}
	
	public Rectangle( double length, double width )
	{
		if( length < 1 || length > 20 )
			throw new IllegalArgumentException( "lenght (" + length + ") out-of-range specified" );
		
		if( width < 1 || width > 20 )
			throw new IllegalArgumentException( "width (" + width + ") out-of-range specified" );
		
		this.length = length;
		this.width = width;
	}
	
	public void setLength( double length )
	{
		if( length < 1 || length > 20 )
			throw new IllegalArgumentException( "length (" + length + ") out-of-range specified" );
		
		this.length = length;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void setWidth( double width )
	{
		if( width < 1 || width > 20 )
			throw new IllegalArgumentException( "width (" + width + ") out-of-range specified" );
		
		this.width = width;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double perimeter()
	{
		return 2 * ( getLength() + getWidth() );
	}
	
	public double area()
	{
		return getLength() * getWidth();
	}
	
	public String toString()
	{
		return String.format( "%nPerimeter: %s%nArea: %s", perimeter(), area() );
	}
}
