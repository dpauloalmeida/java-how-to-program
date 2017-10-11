package Cap12_8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Align extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
					Align frame = new Align();
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
	public Align()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 406, 220 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JCheckBox chckbxSnapToGrid = new JCheckBox("Snap to Grid");
		chckbxSnapToGrid.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxSnapToGrid.setBounds(30, 63, 97, 23);
		contentPane.add(chckbxSnapToGrid);
		
		JCheckBox chckbxShowGrid = new JCheckBox("Show Grid");
		chckbxShowGrid.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxShowGrid.setBounds(30, 89, 97, 23);
		contentPane.add(chckbxShowGrid);
		
		JLabel lblX = new JLabel("X:");
		lblX.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblX.setBounds(139, 46, 25, 23);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y:");
		lblY.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblY.setBounds(139, 116, 25, 23);
		contentPane.add(lblY);
		
		textField = new JTextField();
		textField.setBounds(155, 46, 60, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 116, 60, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(248, 22, 97, 30);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(248, 74, 97, 30);
		contentPane.add(btnCancel);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHelp.setBounds(248, 126, 97, 30);
		contentPane.add(btnHelp);
	}

}
