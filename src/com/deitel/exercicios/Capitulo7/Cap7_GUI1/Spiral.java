package com.deitel.exercicios.Capitulo7.Cap7_GUI1;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Spiral extends JPanel
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		int pass = 7;
		
		int coodX = getWidth() / 2;
		int coodY = getHeight() / 2;
		
		int cood2X = getWidth() / 2;
		int cood2Y = getHeight() / 2 + ( getHeight() / pass );
		
		g.setColor( Color.RED );
		
		for( int sizeLine = 1; sizeLine <= 10; sizeLine++ )
		{
			g.drawLine( coodX, coodY, cood2X, cood2Y );
			
			if( sizeLine % 2 == 1 )
			{
				coodX -= sizeLine * ( getWidth() / pass );
				coodY += sizeLine * ( getHeight() / pass );
			}
			else
			{
				coodX += sizeLine  * ( getWidth() / pass );
				coodY -= sizeLine * ( getHeight() / pass );
			}
			
			g.drawLine( coodX, coodY, cood2X, cood2Y );
			
			if( sizeLine % 2 == 1 )
			{
				cood2X -= sizeLine * ( getWidth() / pass );
				cood2Y -= ( 1 + sizeLine ) * ( getHeight() / pass );
			}
			else
			{
				cood2Y += ( 1 + sizeLine ) * ( getHeight() / pass );
				cood2X += sizeLine * ( getWidth() / pass );
			}
		}
		
		
	}
}
