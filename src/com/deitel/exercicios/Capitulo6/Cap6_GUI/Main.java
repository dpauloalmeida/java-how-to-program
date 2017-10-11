package com.deitel.exercicios.Capitulo6.Cap6_GUI;

import com.deitel.exercicios.Capitulo16.Cap16_15.Choice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main
{
	public static void main( String[] args )
	{
		Choice choice = new Choice();
		DrawSmiley panel = new DrawSmiley();
		JFrame app = new JFrame();
		
		String choiceColor = JOptionPane.showInputDialog("Enter to color:");
		
		choice.setColor(choiceColor.toLowerCase());
		panel.setColor(choice.getColor());
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.add( panel );
		app.setSize( 240, 260 );
		app.setVisible( true );
	}
}
