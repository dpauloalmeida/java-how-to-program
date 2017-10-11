package Cap13_11_12;

import javax.swing.JFrame;

import Cap13_11_12.GridDrawLine;

public class Main
{

	public static void main( String[] args )
	{
		JFrame app = new JFrame( "Grid" );
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		GridDrawLine grid = new GridDrawLine();
		app.add( grid );
		app.setBounds( 400, 400, 530, 500 );
		app.setVisible( true );
	}

}
