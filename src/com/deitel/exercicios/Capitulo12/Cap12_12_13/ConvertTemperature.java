package Cap12_12_13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class ConvertTemperature extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
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
					ConvertTemperature frame = new ConvertTemperature();
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
	public ConvertTemperature()
	{
		setTitle("ConvertTemperature");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 400, 400, 200, 300 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Insira a Temperatura");
		lblTemperatura.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTemperatura.setBounds(22, 32, 139, 20);
		contentPane.add(lblTemperatura);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(18, 63, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 190, 164, 20);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnFahrenheit = new JRadioButton("Fahrenheit", true);
		buttonGroup.add(rdbtnFahrenheit);
		rdbtnFahrenheit.setBounds(18, 100, 77, 23);
		contentPane.add(rdbtnFahrenheit);
		
		JRadioButton rdbtnKelvin = new JRadioButton("Kelvin", false);
		buttonGroup.add(rdbtnKelvin);
		rdbtnKelvin.setBounds(113, 100, 53, 23);
		contentPane.add(rdbtnKelvin);
		
		JButton btnNewButton = new JButton("Converta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				double convert = 0;
				
				try
				{
					if( rdbtnFahrenheit.isSelected() )
						convert = ( Double.parseDouble( textField.getText() ) - 32 ) / 1.8;
					else if( rdbtnKelvin.isSelected() )
						convert = Double.parseDouble( textField.getText() ) + 273.15;
					
					lblNewLabel.setText( String.format( "Resultado: %.2f", convert ) );
				}
				catch( Exception e )
				{
					JOptionPane.showMessageDialog( ConvertTemperature.this, "Insira um número válido" );
				}
				
			}
		});
		btnNewButton.setBounds(45, 144, 90, 35);
		contentPane.add(btnNewButton);

	}
}
