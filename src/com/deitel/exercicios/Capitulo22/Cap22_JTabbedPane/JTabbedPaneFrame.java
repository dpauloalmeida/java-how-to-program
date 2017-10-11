package Cap22_JTabbedPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JButton;

public class JTabbedPaneFrame extends JFrame
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
					JTabbedPaneFrame frame = new JTabbedPaneFrame();
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
	public JTabbedPaneFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 300, 300, 300, 250 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		contentPane.setLayout( new BorderLayout( 0, 0 ) );
		setContentPane( contentPane );
		
		JTabbedPane tabbedPane = new JTabbedPane();
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Tab One", null, panel, null);
		
		JLabel lblPanelOne = new JLabel("panel one");
		panel.add(lblPanelOne);
		lblPanelOne.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Tab Two", null, panel_1, null);
		panel_1.setBackground( java.awt.Color.YELLOW );
		
		JLabel lblPanelTwo = new JLabel("panel two");
		panel_1.add(lblPanelTwo);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Tab Three", null, panel_2, null);
		panel_2.setLayout(new BorderLayout());
		
		JButton btnNorth = new JButton("North");
		panel_2.add(btnNorth, BorderLayout.NORTH);
		
		JButton btnSouth = new JButton("South");
		panel_2.add(btnSouth, BorderLayout.SOUTH);
		
		JButton btnWest = new JButton("West");
		panel_2.add(btnWest, BorderLayout.WEST);
		
		JButton btnEast = new JButton("East");
		panel_2.add(btnEast, BorderLayout.EAST);
		
		JLabel lblPanelThree = new JLabel("panel three");
		lblPanelThree.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPanelThree, BorderLayout.CENTER);
	}

}
