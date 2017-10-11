package com.deitel.exercicios.Capitulo22.Cap22_10;

import java.awt.Graphics;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class Draw extends JPanel
{
	private int diameter = 100;
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.setColor( Color.BLACK );
		
		g.fillOval( 110, 10, diameter, diameter );
	}
	
	public void setDiameter( int diameter )
	{
		this.diameter = ( diameter >= 100 ? diameter : 100 );
		repaint();
	}
	
	public int getDiameter()
	{
		return diameter;
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension( 250, 500 );
	}
	
	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}
}
