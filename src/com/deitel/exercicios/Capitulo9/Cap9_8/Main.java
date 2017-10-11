package Cap9_8;

public class Main
{

	public static void main( String[] args )
	{
		Quadrilateral myQuadrilateral = new Quadrilateral( 10, 10 );
		Trapezoid myTrapezoid = new Trapezoid( 10, 10, 5 );
		Parallelogram myParallelogram = new Parallelogram( 10, 10 );
		
		System.out.println( myQuadrilateral );
		System.out.println( myTrapezoid );
		System.out.println( myParallelogram );
	}

}
