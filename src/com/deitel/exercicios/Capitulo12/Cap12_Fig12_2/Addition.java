package Cap12_Fig12_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addition extends JFrame
{

	private JPanel contentPane;
	private JTextField textFistNumber;
	private JTextField textSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args )
	{
		 try 
		 {UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		 } 
		 catch (Exception ex) 
		 {
	        ex.printStackTrace();
		 }
		
		EventQueue.invokeLater( new Runnable()
		{
			public void run()
			{
				try
				{
					Addition frame = new Addition();
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
	public Addition()
	{
		setTitle("Input");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 300 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JLabel lblFistNumber = new JLabel("Infome o primeiro n\u00FAmero");
		lblFistNumber.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lblFistNumber.setBounds(12, 13, 203, 16);
		contentPane.add(lblFistNumber);
		
		JLabel lblSecondNumber = new JLabel("Infome o segundo n\u00FAmero");
		lblSecondNumber.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		lblSecondNumber.setBounds(12, 89, 188, 16);
		contentPane.add(lblSecondNumber);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblResultado.setBounds(140, 214, 153, 34);
		contentPane.add(lblResultado);
		
		textFistNumber = new JTextField();
		textFistNumber.setBounds(27, 42, 116, 22);
		contentPane.add(textFistNumber);
		textFistNumber.setColumns(10);
		
		textSecondNumber = new JTextField();
		textSecondNumber.setColumns(10);
		textSecondNumber.setBounds(27, 118, 116, 22);
		contentPane.add(textSecondNumber);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					int number1 = Integer.parseInt( textFistNumber.getText() );
					int number2 = Integer.parseInt( textSecondNumber.getText() );
					
					lblResultado.setText( "Resultado: " + ( number1 + number2 ) );
				}
				catch( Exception e2 )
				{
					JOptionPane.showMessageDialog( null, "Entre com um número valido" );
				}
				
			}
		});
		btnSomar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnSomar.setBounds(274, 28, 148, 98);
		contentPane.add(btnSomar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		btnNewButton.setBounds(296, 172, 95, 25);
		contentPane.add(btnNewButton);
		
	}

}
