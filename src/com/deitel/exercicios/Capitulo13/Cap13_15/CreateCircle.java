package Cap13_15;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import java.awt.BasicStroke;

public class CreateCircle extends JPanel
{
	private double raio;
	
	public CreateCircle( int raio )
	{
		if( raio < 0 )
			throw new IllegalArgumentException( "Raio smeller than 0");
		
		this.raio = raio;
	}
	
	public double getRaio()
	{
		return raio;
	}
	
	@Override
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setStroke( new BasicStroke( 5f ) );
		
		g2d.draw( new Ellipse2D.Double( 30, 30, 2 * getRaio(), 2 * Math.PI * getRaio() ) );
	}
}
