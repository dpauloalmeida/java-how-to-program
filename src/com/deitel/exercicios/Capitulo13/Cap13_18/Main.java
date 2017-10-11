package Cap13_18;


import javax.swing.JFrame;
import java.awt.Color;

public class Main
{

	public static void main( String[] args )
	{
		JFrame app = new JFrame("Draw Arc");
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		DrawCircleArc arcs = new DrawCircleArc();
		app.add( arcs );
		app.setSize( 950, 400 );
		app.setVisible( true );

	}

}
