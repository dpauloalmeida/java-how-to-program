package com.deitel.exercicios.Capitulo8.Cap8_GUI;


import java.awt.Color;
import java.awt.Graphics;

public class DrawLine extends MyShape
{
	// contrutor
	public DrawLine()
	{	
	}
	
	public DrawLine( int x1, int y1, int x2, int y2, Color color )
	{
		super( x1, y1, x2, y2, color );
	}
	
	@Override
	public void draw( Graphics g )
	{
		g.setColor( super.getColor() );
		g.drawLine( super.getX1(), super.getY1(), super.getX2(), super.getY2() );

	}

}
