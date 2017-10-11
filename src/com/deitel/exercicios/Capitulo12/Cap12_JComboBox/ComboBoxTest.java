package Cap12_JComboBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;

public class ComboBoxTest extends JFrame
{

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main( String[] args )
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater( new Runnable()
		{
			public void run()
			{
				try
				{
					ComboBoxTest frame = new ComboBoxTest();
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
	public ComboBoxTest()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 197 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		Icon[] icons = { new ImageIcon("C:\\icon.png"), new ImageIcon("C:\\icon1.png"), new ImageIcon("C:\\icon2.png") };

		JLabel lblNewLabel = new JLabel( icons[ 0 ] );
		lblNewLabel.setBounds(224, 13, 133, 129);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
	
				if( event.getStateChange() == ItemEvent.SELECTED )
				{
					lblNewLabel.setIcon(icons[comboBox.getSelectedIndex()]);
				}
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bug1", "Bug2", "Bug3"}));
		comboBox.setBounds(12, 13, 158, 22);
		contentPane.add(comboBox);



	}
}
