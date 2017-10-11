package com.deitel.exercicios.Capitulo8.Cap8_GUI;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class MyShape extends JPanel
{
	private int x1; // coordenada de x da primeira extremidade
	private int y1; // coordenada de y da primeira extremidade
	private int x2; // coordenada de x da segunda extremidade
	private int y2; // coordenada de y da segunda extremidade
	private Color color; // atribui uma cor
	
	// contrutores
	public MyShape()
	{
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		this.color = Color.BLACK;
	}
	
	public MyShape( int x1, int y1, int x2, int y2, Color color )
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}
	
	public void setX1( int x1 )
	{
		this.x1 = x1;
	}
	
	public int getX1()
	{
		return x1;
	}
	
	public void setY1( int y1 )
	{
		this.y1 = y1;
	}
	
	public int getY1()
	{
		return y1;
	}
	
	public void setX2( int x2 )
	{
		this.x2 = x2;
	}
	
	public int getX2()
	{
		return x2;
	}
	
	public void setY2( int y2 )
	{
		this.y2 = y2;
	}
	public int getY2()
	{
		return y2;
	}
	
	public void setColor( Color color )
	{
		this.color = color;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public abstract void draw( Graphics g );
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		draw( g );
	}

}
