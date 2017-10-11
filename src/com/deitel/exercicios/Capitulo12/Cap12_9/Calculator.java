package Cap12_9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculator extends JFrame
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
					Calculator frame = new Calculator();
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
	public Calculator()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 265, 340 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder(5, 5, 5, 5) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setBounds(10, 238, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton(".");
		button.setBounds(70, 238, 50, 50);
		contentPane.add(button);
		
		JButton button_1 = new JButton("=");
		button_1.setBounds(130, 238, 50, 50);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.setBounds(190, 238, 50, 50);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("1");
		button_3.setBounds(10, 178, 50, 50);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.setBounds(70, 178, 50, 50);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(130, 178, 50, 50);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.setBounds(190, 178, 50, 50);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setBounds(10, 116, 50, 50);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.setBounds(70, 116, 50, 50);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.setBounds(130, 116, 50, 50);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setBounds(190, 116, 50, 50);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("7");
		button_11.setBounds(10, 55, 50, 50);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("8");
		button_12.setBounds(70, 55, 50, 50);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("9");
		button_13.setBounds(130, 55, 50, 50);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.setBounds(190, 55, 50, 50);
		contentPane.add(button_14);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 230, 32);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
