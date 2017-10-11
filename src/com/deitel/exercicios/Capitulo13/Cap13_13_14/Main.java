package Cap13_13_14;

import javax.swing.JFrame;

import Cap13_11_12.GridDrawLine;

public class Main
{

	public static void main( String[] args )
	{
		JFrame app = new JFrame( "Grid" );
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		GridDrawRect rect = new GridDrawRect();
		app.add( rect );

		app.setBounds( 400, 400, 500, 500 );
		app.setVisible( true );
	}

}
