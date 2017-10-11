package Cap6_GUI2;


import javax.swing.JFrame;

public class Main
{
	public static void main( String[] args )
	{
		RandomForms panel = new RandomForms();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.add( panel );
		app.setSize( 500, 500 );
		app.setVisible( true );
	}
}
