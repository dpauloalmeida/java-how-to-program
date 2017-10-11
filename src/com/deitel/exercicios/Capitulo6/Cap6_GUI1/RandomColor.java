package Cap6_GUI1;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class RandomColor extends JPanel
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		for( int i = 0; i <= 5; i++ )
		{
			if( i % 2 == 0)
				g.setColor( Color.BLUE );
			else
				g.setColor( Color.CYAN );
			
			g.fillOval(  i * 20, i * 20, 200 - i * 40, 200 - i * 40 );
		}
		
	}
}
