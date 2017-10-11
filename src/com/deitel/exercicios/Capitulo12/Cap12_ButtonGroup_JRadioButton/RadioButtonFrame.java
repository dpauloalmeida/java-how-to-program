package Cap12_ButtonGroup_JRadioButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField txtRadioButtonTest;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
					RadioButtonFrame frame = new RadioButtonFrame();
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
	public RadioButtonFrame()
	{
		setTitle("Radio Button Test");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 121 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		txtRadioButtonTest = new JTextField( "Veja o estilo da fonte" );
		txtRadioButtonTest.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtRadioButtonTest.setEditable(false);
		txtRadioButtonTest.setHorizontalAlignment(SwingConstants.CENTER);
		txtRadioButtonTest.setBounds(12, 13, 410, 29);
		contentPane.add(txtRadioButtonTest);
		txtRadioButtonTest.setColumns(10);
		
		JRadioButton rdbtnSimples = new JRadioButton("Simples", true);
		buttonGroup.add(rdbtnSimples);
		rdbtnSimples.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font( "Segoe UI", Font.PLAIN, 14 );
				
				txtRadioButtonTest.setFont( font );
			}
		});
		rdbtnSimples.setBounds(22, 48, 75, 25);
		contentPane.add(rdbtnSimples);
		
		JRadioButton rdbtnNegrito = new JRadioButton("Negrito", false);
		rdbtnNegrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font( "Segoe UI", Font.BOLD, 14 );
				
				txtRadioButtonTest.setFont( font );
			}
		});
		buttonGroup.add(rdbtnNegrito);
		rdbtnNegrito.setBounds(115, 48, 75, 25);
		contentPane.add(rdbtnNegrito);
		
		JRadioButton rdbtnItalico = new JRadioButton("Italico", false);
		rdbtnItalico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font( "Segoe UI", Font.ITALIC, 14 );
				
				txtRadioButtonTest.setFont( font );
			}
		});
		buttonGroup.add(rdbtnItalico);
		rdbtnItalico.setBounds(208, 48, 75, 25);
		contentPane.add(rdbtnItalico);
		
		JRadioButton rdbtnNegritoialico = new JRadioButton("Negrito/Itálico", false);
		rdbtnNegritoialico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Font font = new Font( "Segoe UI", Font.BOLD + Font.ITALIC, 14 );
				
				txtRadioButtonTest.setFont( font );
			}
		});
		buttonGroup.add(rdbtnNegritoialico);
		rdbtnNegritoialico.setBounds(301, 48, 119, 25);
		contentPane.add(rdbtnNegritoialico);
	}
}
