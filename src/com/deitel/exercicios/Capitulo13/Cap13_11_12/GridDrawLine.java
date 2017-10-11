package Cap13_11_12;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Line2D;

public class GridDrawLine extends JPanel
{
	@Override
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		setBackground( new Color( 240, 240, 240 ) );
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setStroke( new BasicStroke( 10.0f ) );
		
		for( int i = 0; i < 8 ; i++ )
		{
			
			g2d.draw( new Line2D.Double( 80, 20 + ( 50 * i ), 430, 20 + ( 50 * i ) ) ); // linha
			g2d.draw( new Line2D.Double( 80 + ( 50 * i ), 20, 80 + ( 50 * i ), 370 ) ); // coluna

		}
	}
}
