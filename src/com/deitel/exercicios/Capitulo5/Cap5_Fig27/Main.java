package Cap5_Fig27;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main
{
	public static void main( String[] args )
	{
		String input = JOptionPane.showInputDialog( "1 - Draw Rectangles\n2 - Draw Ovals" );
		
		int choice = Integer.parseInt( input );
		
		Shapes panel = new Shapes( choice );
		
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		app.add( panel );
		app.setSize(  300, 300 );
		app.setVisible( true );
	}
}
