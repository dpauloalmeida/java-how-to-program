package Cap9_8;

public class Parallelogram extends Trapezoid
{
	public Parallelogram( double x, double y )
	{
		super( x, y );
	}
	
	@Override
	public String toString()
	{
		return String.format( "%s: %.2f", "Parallelogram", super.areaQ() );
	}
}
