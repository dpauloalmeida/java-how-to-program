package Cap12_10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ColorSelect extends JFrame
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
					ColorSelect frame = new ColorSelect();
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
	public ColorSelect()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 400, 400, 370, 170 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vermelho", "Preto", "Azul", "Verde", "Laranja", "Amarelo"}));
		comboBox.setBounds(10, 11, 334, 30);
		contentPane.add(comboBox);
		
		JCheckBox chckbxBackground = new JCheckBox("Background");
		chckbxBackground.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxBackground.setBounds(47, 51, 107, 29);
		contentPane.add(chckbxBackground);
		
		JCheckBox chckbxForeground = new JCheckBox("Foreground");
		chckbxForeground.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		chckbxForeground.setBounds(201, 51, 105, 29);
		contentPane.add(chckbxForeground);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(83, 95, 85, 25);
		contentPane.add(btnOk);
		
		JButton btnCancela = new JButton("Cancela");
		btnCancela.setBounds(182, 95, 85, 25);
		contentPane.add(btnCancela);
	}

}
