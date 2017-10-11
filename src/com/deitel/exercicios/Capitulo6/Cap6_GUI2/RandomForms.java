package Cap6_GUI2;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class RandomForms extends JPanel
{
	SecureRandom randomNumbers = new SecureRandom();
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		for( int i = 0; i < 10; i++ )
		{
			int form = randomNumbers.nextInt( 2 );
			int color = randomNumbers.nextInt( 4 );
			
			int width = 1 + randomNumbers.nextInt( 250 );
			int height = 1 + randomNumbers.nextInt( 250 );
			int x = randomNumbers.nextInt( 500 );
			int y = randomNumbers.nextInt( 500 );
			
			switch( color )
			{
				case 0:
					g.setColor( Color.BLACK );
					break;
				case 1:
					g.setColor( Color.BLUE );
					break;
				case 2:
					g.setColor( Color.GRAY );
					break;
				case 3:
					g.setColor( Color.ORANGE );
					break;	
			}
			
			switch( form )
			{
				case 0:
					g.fillRect( x, y, width, height );
					break;
				case 1:
					g.fillOval( x, y, width, height );
					break;
			}
		}
	}
}
