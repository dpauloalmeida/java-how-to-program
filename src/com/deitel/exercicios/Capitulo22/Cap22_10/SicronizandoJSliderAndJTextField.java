package com.deitel.exercicios.Capitulo22.Cap22_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SicronizandoJSliderAndJTextField extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;

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
					SicronizandoJSliderAndJTextField frame = new SicronizandoJSliderAndJTextField();
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
	public SicronizandoJSliderAndJTextField()
	{
		Draw draw = new Draw();
		draw.setBackground(Color.ORANGE);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 450 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.ORANGE);
		desktopPane.setBounds(0, 0, 434, 333);
		contentPane.add(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		desktopPane.add( draw, BorderLayout.CENTER );
		
		JSlider slider = new JSlider( SwingConstants.HORIZONTAL, 100, 200, 100 );
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent event) {
				
				draw.setDiameter( slider.getValue() );
			}
		});
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(10);
		desktopPane.add( slider, BorderLayout.SOUTH );
		
		textField = new JTextField();
		textField.setBounds(126, 347, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				try
				{
					int number = Integer.parseInt( textField.getText() );
					
					slider.setValue( number );
					
					textField.setText( "" );
					
				}
				catch( Exception e )
				{
					JOptionPane.showMessageDialog( SicronizandoJSliderAndJTextField.this, "Inv�lido" );
					
					textField.setText( "" );
				}
			}
		});
		btnNewButton.setBounds(254, 346, 95, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblValor.setBounds(82, 350, 32, 16);
		contentPane.add(lblValor);
	}
}
