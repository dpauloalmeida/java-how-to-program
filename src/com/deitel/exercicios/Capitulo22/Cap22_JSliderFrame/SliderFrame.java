package com.deitel.exercicios.Capitulo22.Cap22_JSliderFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class SliderFrame extends JFrame
{

	private JPanel contentPane;
	private JSlider slider_1;

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
					SliderFrame frame = new SliderFrame();
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
	public SliderFrame()
	{
		OvalPanel myPanel = new OvalPanel();
		myPanel.setBackground( Color.YELLOW );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 400, 300 );
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JSlider slider = new JSlider();
		slider_1 = new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				myPanel.setDiameter( slider_1.getValue() );
			}
		});
		slider_1.setMajorTickSpacing( 10 );
		slider_1.setPaintTicks( true );
		contentPane.add(slider_1, BorderLayout.SOUTH);
		
		add( myPanel );
	}

}
