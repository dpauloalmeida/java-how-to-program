package com.deitel.exercicios.Capitulo8.Cap8_GUI;


import java.security.SecureRandom;

import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Color;

public class Main
{

	public static void main( String[] args )
	{	
		SecureRandom random = new SecureRandom();
		
		JFrame app = new JFrame();
		
		MyShape[] shapes = new MyShape[ 3 ];
		
		shapes[ 0 ] = new DrawLine( 1 + random.nextInt( 250 ), 1 + random.nextInt( 250 ),
				1 + random.nextInt( 250 ), 1 + random.nextInt( 250 ), Color.BLACK );
		
		shapes[ 1 ] = new DrawRectangle( 1 + random.nextInt( 250 ), 1 + random.nextInt( 250 ),
				1 + random.nextInt( 250 ), 1 + random.nextInt( 250 ), Color.BLACK );
		
		shapes[ 2 ] = new DrawOval( 1 + random.nextInt( 250 ), 1 + random.nextInt( 250 ),
				1 + random.nextInt( 250 ), 1 + random.nextInt( 250 ), Color.BLACK );
		
		
		for( MyShape shape : shapes )
			app.add( shape );
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		app.setSize( 500, 500 );
		app.setVisible( true );

	}

}
