package Cap12_JCheckBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.UIManager;

public class JCheckBoxFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	
	private final JCheckBox checkBoxBold;
	private final JCheckBox checkBoxItalic;

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
					JCheckBoxFrame frame = new JCheckBoxFrame();
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
	public JCheckBoxFrame()
	{
		setTitle("JCheck Box Test");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 306, 138 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		textField = new JTextField( "Veja o estilo da fonte" );
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField.setBounds(12, 13, 266, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		checkBoxBold = new JCheckBox("Bold");
		checkBoxBold.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		checkBoxBold.setBounds(25, 67, 107, 25);
		contentPane.add(checkBoxBold);
		
		checkBoxItalic = new JCheckBox("Italico");
		checkBoxItalic.setBounds(157, 67, 107, 25);
		contentPane.add(checkBoxItalic);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		
		checkBoxBold.addItemListener( handler );
		checkBoxItalic.addItemListener( handler );

	}
	
	private class CheckBoxHandler implements ItemListener
	{
		@Override
		public void itemStateChanged( ItemEvent event )
		{
			Font font = new Font( "Segoe UI", Font.PLAIN, 14);
			
			if( checkBoxBold.isSelected() && checkBoxItalic.isSelected() )
				font = new Font( "Segoe UI", Font.BOLD + Font.ITALIC, 14 );
			else if( checkBoxBold.isSelected() )
				font = new Font( "Segoe UI", Font.BOLD, 14 );
			else if( checkBoxItalic.isSelected() )
				font = new Font( "Segoe UI", Font.ITALIC, 14 );
			
			textField.setFont( font );
		}
	}
}
