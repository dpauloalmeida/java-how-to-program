package Cap13_6_7_8;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;
import java.security.SecureRandom;

public class DrawCircleArc extends JPanel
{
	private static SecureRandom random = new SecureRandom();
	private Color color;
	
	@Override
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		setBackground(  new Color( 240, 240, 240) );
		
		Graphics2D g2d = ( Graphics2D ) g;
		
		for( int i = 1; i <= 8; i++ )
		{	
			g2d.setPaint( new Color( random.nextInt( 256 ), random.nextInt( 256 ), 
					random.nextInt( 256 ) ) );
			
			g2d.setStroke(  new java.awt.BasicStroke( random.nextInt( 10 ) ) );
			
			g2d.draw( new Line2D.Double( 50 + random.nextInt( 900 ), 50 + random.nextInt( 350 ), 
					50 + random.nextInt( 900 ), 50 + random.nextInt( 350 ) ) );
			
		}
	}
}
