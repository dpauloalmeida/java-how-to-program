package com.deitel.exercicios.Capitulo22.Cap22_JSliderFrame;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;

public class OvalPanel extends JPanel
{
	
	public OvalPanel() {
	}
	
	private int diameter = 10;
	
	@Override
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.fillOval( 10, 10, diameter, diameter );
	}
	
	public void setDiameter( int diameter )
	{
		this.diameter = ( diameter >= 0 ? diameter : 10 );
		
		repaint();
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension( 200, 200 );
	}
	
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}

}
