package Cap5_Fig27;


import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6666030364397363534L;
	private int choice;
	
	public Shapes( int choice )
	{
		this.choice = choice;
	}
	
	public void paintComponet( Graphics g )
	{
		super.paintComponent( g );
		
		for( int i = 0; i < 10; i++ )
		{
			switch( choice )
			{
				case 1:
					g.drawRect( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
					break;
				case 2:
					g.drawOval( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
					break;	
			}
		}
	}
}
