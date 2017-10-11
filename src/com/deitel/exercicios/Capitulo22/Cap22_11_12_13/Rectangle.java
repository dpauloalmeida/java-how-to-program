package Cap22_11_12_13;

import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Rectangle extends JPanel
{
	private Color color;
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		Graphics2D g2d = (Graphics2D) g;
		
		g.setColor( color );
		
		g2d.setStroke( new BasicStroke( 5 ) );
		
		g.drawRect( getWidth() / 2 + 20, 22, 150, 295 );
		
		g.fillRect( getWidth() / 2 - 180, 20, 150, 300 );
	}
	
	public void setSliderColor( int r, int g, int b )
	{
		color = new Color( r, g, b );
		
		repaint();
	}
}
