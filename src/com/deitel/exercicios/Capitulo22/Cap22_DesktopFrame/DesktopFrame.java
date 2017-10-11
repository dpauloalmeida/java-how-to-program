package Cap22_DesktopFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Frame;

public class DesktopFrame extends JFrame
{

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
					DesktopFrame frame = new DesktopFrame();
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
	public DesktopFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 300, 300, 600, 480 );
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		JMenu mnAdd = new JMenu("Add");
		mnAdd.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnAdd.setMnemonic('a');
		menuBar.add(mnAdd);
		
		JMenuItem mntmInternalFrame = new JMenuItem("Internal Frame");
		mntmInternalFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				javax.swing.JInternalFrame frame = new JInternalFrame( "Internal Frame", true, true, true, true );
				
				MyPanel panel = new MyPanel();
				frame.getContentPane().add( panel, BorderLayout.CENTER );
				frame.setSize( 200, 200 );
				frame.pack();
	
				JScrollPane panelScroll = new JScrollPane( panel );
				frame.getContentPane().add( panelScroll );
				
				add( frame );
				frame.setVisible( true );
				
				try
				{
					frame.setMaximum( true );
				}
				catch( PropertyVetoException e )
				{
					e.printStackTrace();
				}
			}
		});
		mnAdd.add(mntmInternalFrame);
	}
}
