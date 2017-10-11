package Cap10_13;

public class Main
{

	public static void main( String[] args )
	{
		Circle circle = new Circle( 2 );
		Square square = new Square( 2 );
		Triangle triangle = new Triangle( 2, 2 );
		
		Shape[] shapes = new Shape[ 3 ];
		
		shapes[ 0 ] = circle;
		shapes[ 1 ] = square;
		shapes[ 2 ] = triangle;

		for( Shape currentShape : shapes )
		{
			System.out.println( currentShape );
			System.out.println( currentShape.getArea() );
		}
	}

}
