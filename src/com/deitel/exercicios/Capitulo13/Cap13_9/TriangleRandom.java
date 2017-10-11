package Cap13_9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class TriangleRandom extends JPanel
{
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		SecureRandom random = new SecureRandom();
		setBackground( new Color( 240, 240, 240 ) );
		
		Graphics2D g2d = (Graphics2D)g;
		
		int[] xPoints = new int[ 10 ];
		int[] yPoints = new int[ 10 ];
		
		GeneralPath triangle = new GeneralPath();
		
		xPoints[ 0 ] = 55;
		yPoints[ 0 ] = 0;
		
		triangle.moveTo( xPoints[ 0 ], yPoints[ 0 ] );
		
		for( int i = 1; i < 10; i++ )
		{
			xPoints[ i ] = 50 + random.nextInt( 650 );
			yPoints[ i ] = 50 + random.nextInt( 400 );
			
			triangle.lineTo( xPoints[ i ], yPoints[ i ] );
		}
		
		triangle.closePath(); // fecha a forma
		
		
		for( int i = 0; i < 20; i++ )
		{
			//g2d.rotate( Math.PI / 10 );
			
			g2d.setColor( new Color( random.nextInt( 256 ), random.nextInt( 256 ),
					random.nextInt( 256 ) ) );
			
			g2d.fill( triangle );
			
		}
	}
}
