package Cap7_GUI;


import javax.swing.JFrame;

public class Main
{

	public static void main( String[] args )
	{
		DrawRainbow panel = new DrawRainbow();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(  JFrame.EXIT_ON_CLOSE );
		
		app.add( panel );
		app.setSize( 400, 250 );
		app.setVisible( true );

	}

}
