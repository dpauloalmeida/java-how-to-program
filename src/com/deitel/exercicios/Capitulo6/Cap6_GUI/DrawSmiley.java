package com.deitel.exercicios.Capitulo6.Cap6_GUI;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel
{
	private Color color;
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.setColor( this.color );
		g.fillOval(  10, 10, 200, 200 );
		
		g.setColor(  Color.BLACK );
		g.fillOval(  55, 65, 30, 30 );
		g.fillOval( 135, 65, 30, 30 );
		
		g.fillOval( 50, 110, 120, 60 );
		
		g.setColor(  color );
		g.fillOval(  50, 110, 120, 50 );
		g.fillOval(  50, 120, 120, 40 );
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
