package com.deitel.exercicios.Capitulo7.Cap7_GUI1;


import javax.swing.JFrame;

public class Main
{

	public static void main( String[] args )
	{
		Spiral panel = new Spiral();
		JFrame app = new JFrame();

		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		app.add( panel );
		app.setSize( 500, 500 );
		app.setVisible( true );
	}

}
