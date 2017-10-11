package Cap22_DesktopFrame;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class MyPanel extends JPanel
{
	private static final SecureRandom generator = new SecureRandom();
	private final ImageIcon picture;
	private final static String[] images = { "C:\\icon.jpg", "C:\\icon1.jpg", "C:\\icon2.jpg" };
	
	public MyPanel()
	{
		int randomNumber = generator.nextInt( images.length );
		picture = new ImageIcon( images[ randomNumber ] );
	}
	
	@Override
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		picture.paintIcon( this, g, 0, 0 );
	}
	
	public Dimension getPreferredSize()
	{	
		return new Dimension( picture.getIconWidth(), picture.getIconHeight() );
	}
	
}
