package com.deitel.exercicios.Capitulo22.Cap22_BoxLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.ComponentOrientation;
import java.awt.Component;

public class BoxLayoutFrame extends JFrame
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
					BoxLayoutFrame frame = new BoxLayoutFrame();
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
	public BoxLayoutFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 400, 220 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		contentPane.setLayout( new BorderLayout( 0, 0 ) );
		setContentPane( contentPane );
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		Box horizontalBox = Box.createHorizontalBox();
		tabbedPane.addTab("Horizontal Box", null, horizontalBox, null);
		
		JButton btnNewButton = new JButton("New button");
		horizontalBox.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		horizontalBox.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		horizontalBox.add(btnNewButton_2);
		
		Box verticalBox = Box.createVerticalBox();
		tabbedPane.addTab("Vertical Box With Structs", null, verticalBox, null);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		verticalBox.add(btnNewButton_3);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		JButton btnNewButton_4 = new JButton("New button");
		verticalBox.add(btnNewButton_4);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		verticalBox.add(btnNewButton_5);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue);
		
		JButton btnNewButton_6 = new JButton("New button");
		horizontalBox_1.add(btnNewButton_6);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1);
		
		JButton btnNewButton_7 = new JButton("New button");
		horizontalBox_1.add(btnNewButton_7);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JButton btnNewButton_8 = new JButton("New button");
		horizontalBox_1.add(btnNewButton_8);
		horizontalBox_1.add( Box.createHorizontalGlue() );
		tabbedPane.addTab("Horizontal Box With Glue", null, horizontalBox_1, null);
		
		Box verticalBox_1 = Box.createVerticalBox();
		tabbedPane.addTab("Vertical Box with Rigid Areas", null, verticalBox_1, null);
		Component rigidArea = Box.createRigidArea( new Dimension( 12, 8 ) );
		verticalBox_1.add( rigidArea );
		
		JButton btnNewButton_9 = new JButton("New button");
		verticalBox_1.add(btnNewButton_9);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(12, 8));
		verticalBox_1.add(rigidArea_1);
		
		JButton btnNewButton_10 = new JButton("New button");
		verticalBox_1.add(btnNewButton_10);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(12, 8));
		verticalBox_1.add(rigidArea_2);
		
		JButton btnNewButton_11 = new JButton("New button");
		verticalBox_1.add(btnNewButton_11);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Vertical Box with Glue", null, panel, null);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		Component verticalGlue = Box.createVerticalGlue();
		panel.add(verticalGlue);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel.add(btnNewButton_12);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel.add(verticalGlue_1);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel.add(btnNewButton_13);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		panel.add(verticalGlue_2);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel.add(btnNewButton_14);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		panel.add(verticalGlue_3);
	}

}
