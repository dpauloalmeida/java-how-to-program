package Cap13_13_14;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.BasicStroke;

public class GridDrawRect extends JPanel
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setStroke( new BasicStroke( 10.0f ) );
		
		for( int i = 0; i < 8; i++ )
		{
			for( int j = 0; j < 8; j++ )
			{
				g2d.draw( new Rectangle2D.Double( 40 + ( j * 50 ), 30 + ( i * 50 ), 50, 50 ) );
			}
			
		}
	}
}
