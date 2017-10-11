package Cap13_9;

import javax.swing.JFrame;

public class Main
{

	public static void main( String[] args )
	{
		JFrame app = new JFrame( "Triangle Random" );
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		TriangleRandom triagles = new TriangleRandom();
		app.add( triagles );
		app.setSize( 750, 500 );
		app.setVisible( true );

	}

}
