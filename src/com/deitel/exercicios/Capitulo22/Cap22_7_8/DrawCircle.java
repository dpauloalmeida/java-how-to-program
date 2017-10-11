package com.deitel.exercicios.Capitulo22.Cap22_7_8;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Dimension;

public class DrawCircle extends JPanel
{
	private int diameter = 200;
	private double raio;
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );

		g.fillOval( 10, 0, diameter, diameter );
		
		raio = diameter / 2;
	}

	public void setDiameter( int diameter )
	{
		this.diameter = ( diameter >= 200 ? diameter : 200 );
		repaint();
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension( 450, 800 );
	}
	
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}

	
	@Override
	public String toString()
	{
		return String.format( "%s: %n%s: %d%n%s: %.2f%n%s: %.2f", "Resultado",
				"Di�metro", diameter, "�rea", Math.PI * ( raio * raio ),
				"Circufer�ncia", 2 * Math.PI * raio );
	}
}
