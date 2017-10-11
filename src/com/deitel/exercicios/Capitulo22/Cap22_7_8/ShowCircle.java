package com.deitel.exercicios.Capitulo22.Cap22_7_8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ShowCircle extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args )
	{
		EventQueue.invokeLater( new Runnable()
		{
			public void run()
			{
				try
				{
					ShowCircle frame = new ShowCircle();
					frame.setVisible( true );
				}
				catch( Exception e )
				{
					e.printStackTrace();
				}
			}
		} );
	}

	/**
	 * Create the frame.
	 */
	public ShowCircle()
	{
		DrawCircle circle = new DrawCircle();
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 250, 25, 450, 600 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.control);
		contentPane.add(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		desktopPane.add( circle, BorderLayout.CENTER );
		circle.setLayout(new BorderLayout(0, 0));
		
		JTextArea txtrResultados = 	new JTextArea();
		txtrResultados.setFocusable(false);
		txtrResultados.setEditable(false);
		txtrResultados.setText( circle.toString() );
		contentPane.add(txtrResultados);
		
		JSlider slider = new JSlider( SwingConstants.HORIZONTAL, 200, 400, 200 );
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				
				circle.setDiameter( slider.getValue() );
				
				txtrResultados.setText( circle.toString() );
			}
		});
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		desktopPane.add(slider, BorderLayout.SOUTH);
		
		Component rigidArea = Box.createRigidArea(new Dimension(5, 5));
		contentPane.add(rigidArea);
	}
}
