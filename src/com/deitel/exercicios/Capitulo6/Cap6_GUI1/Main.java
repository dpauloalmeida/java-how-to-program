package Cap6_GUI1;


import javax.swing.JFrame;

public class Main
{
	public static void main( String[] args )
	{
		RandomColor panel = new RandomColor();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.add( panel );
		app.setSize( 220, 240 );
		app.setVisible( true );
	}
}
