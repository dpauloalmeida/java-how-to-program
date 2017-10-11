package Cap22_LookAndFell;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LookAndFellFrame extends JFrame
{

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
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
					LookAndFellFrame frame = new LookAndFellFrame();
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
	public LookAndFellFrame()
	{
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 424, 300 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setSelected(true);
		rdbtnWindows.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					
					SwingUtilities.updateComponentTreeUI(contentPane);
				}
				catch( ClassNotFoundException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( InstantiationException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( IllegalAccessException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( UnsupportedLookAndFeelException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonGroup.add(rdbtnWindows);
		rdbtnWindows.setBounds(6, 237, 115, 18);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnMetal = new JRadioButton("Metal");
		rdbtnMetal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				try
				{
					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
					
					SwingUtilities.updateComponentTreeUI(contentPane);
				}
				catch( ClassNotFoundException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( InstantiationException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( IllegalAccessException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( UnsupportedLookAndFeelException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	 
			}
		});
		buttonGroup.add(rdbtnMetal);
		rdbtnMetal.setBounds(6, 207, 115, 18);
		contentPane.add(rdbtnMetal);
		
		JRadioButton rdbtnWindowsClassic = new JRadioButton("Windows Classic");
		rdbtnWindowsClassic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					
					SwingUtilities.updateComponentTreeUI(contentPane);
				}
				catch( ClassNotFoundException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( InstantiationException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( IllegalAccessException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( UnsupportedLookAndFeelException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonGroup.add(rdbtnWindowsClassic);
		rdbtnWindowsClassic.setBounds(159, 237, 147, 18);
		contentPane.add(rdbtnWindowsClassic);
		
		JRadioButton rdbtnNimbus = new JRadioButton("Nimbus");
		rdbtnNimbus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					
					SwingUtilities.updateComponentTreeUI(contentPane);
				}
				catch( ClassNotFoundException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( InstantiationException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( IllegalAccessException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( UnsupportedLookAndFeelException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		buttonGroup.add(rdbtnNimbus);
		rdbtnNimbus.setBounds(159, 207, 115, 18);
		contentPane.add(rdbtnNimbus);
		
		JRadioButton rdbtnCdemotif = new JRadioButton("CDE/Motif");
		rdbtnCdemotif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
					
					SwingUtilities.updateComponentTreeUI(contentPane);
				}
				catch( ClassNotFoundException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( InstantiationException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( IllegalAccessException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				catch( UnsupportedLookAndFeelException e1 )
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonGroup.add(rdbtnCdemotif);
		rdbtnCdemotif.setBounds(313, 207, 76, 18);
		contentPane.add(rdbtnCdemotif);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Metal", "Windows", "Nimbus", "Windows Classic", "CDE/Motif"}));
		comboBox.setBounds(6, 94, 396, 26);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(6, 54, 396, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 396, 16);
		contentPane.add(lblNewLabel);
	}
}
