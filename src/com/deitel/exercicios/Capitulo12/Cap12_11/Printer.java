package Cap12_11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;
import javax.swing.ButtonGroup;

public class Printer extends JFrame
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
					Printer frame = new Printer();
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
	public Printer()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 400, 400, 500, 250 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Printer MyPrinter");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 117, 20);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setRows(10);
		textArea.setColumns(5);
		textArea.setBounds(10, 42, 65, 85);
		contentPane.add(textArea);
		
		JCheckBox chckbxImage = new JCheckBox("Image");
		chckbxImage.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxImage.setBounds(81, 43, 61, 25);
		contentPane.add(chckbxImage);
		
		JCheckBox chckbxText = new JCheckBox("Text");
		chckbxText.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxText.setBounds(81, 71, 51, 25);
		contentPane.add(chckbxText);
		
		JCheckBox chckbxCode = new JCheckBox("Code");
		chckbxCode.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxCode.setBounds(81, 99, 53, 25);
		contentPane.add(chckbxCode);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setRows(10);
		textArea_1.setLineWrap(true);
		textArea_1.setColumns(5);
		textArea_1.setBounds(144, 42, 65, 85);
		contentPane.add(textArea_1);
		
		JRadioButton checkBox_2 = new JRadioButton("Selection");
		buttonGroup.add(checkBox_2);
		checkBox_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		checkBox_2.setBounds(215, 43, 77, 25);
		contentPane.add(checkBox_2);
		
		JRadioButton checkBox_3 = new JRadioButton("All");
		buttonGroup.add(checkBox_3);
		checkBox_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		checkBox_3.setBounds(215, 71, 39, 25);
		contentPane.add(checkBox_3);
		
		JRadioButton checkBox_4 = new JRadioButton("Applet");
		buttonGroup.add(checkBox_4);
		checkBox_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		checkBox_4.setBounds(215, 99, 63, 25);
		contentPane.add(checkBox_4);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setRows(10);
		textArea_2.setLineWrap(true);
		textArea_2.setColumns(5);
		textArea_2.setBounds(292, 42, 65, 85);
		contentPane.add(textArea_2);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(385, 14, 90, 35);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(385, 63, 90, 35);
		contentPane.add(btnCancelar);
		
		JButton btnSetup = new JButton("Setup");
		btnSetup.setBounds(385, 112, 90, 35);
		contentPane.add(btnSetup);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(385, 161, 90, 35);
		contentPane.add(btnHelp);
		
		JLabel lblQuality = new JLabel("Quality:");
		lblQuality.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblQuality.setBounds(85, 153, 42, 16);
		contentPane.add(lblQuality);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(2);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"High", "Mediun", "Low"}));
		comboBox.setBounds(144, 152, 65, 20);
		contentPane.add(comboBox);
		
		JCheckBox chckbxPintToFile = new JCheckBox("Print to file");
		chckbxPintToFile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxPintToFile.setBounds(215, 150, 97, 23);
		contentPane.add(chckbxPintToFile);
	}

}
