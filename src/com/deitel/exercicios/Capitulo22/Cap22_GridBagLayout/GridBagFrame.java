package Cap22_GridBagLayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class GridBagFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField txtTextfield;

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
					GridBagFrame frame = new GridBagFrame();
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
	public GridBagFrame()
	{
		super( "GridBagLayout" );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 300, 150 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {98, 110, 31};
		gbl_contentPane.rowHeights = new int[] {4, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		JTextArea TextArea1 = new JTextArea();
		TextArea1.setLineWrap(true);
		TextArea1.setText("TextArea1");
		GridBagConstraints gbc_TextArea1 = new GridBagConstraints();
		gbc_TextArea1.insets = new Insets(0, 0, 5, 5);
		gbc_TextArea1.fill = GridBagConstraints.BOTH;
		gbc_TextArea1.gridx = 0;
		gbc_TextArea1.gridy = 0;
		gbc_TextArea1.gridheight = 3;
		contentPane.add(TextArea1, gbc_TextArea1);
		
		JButton btnNewButton = new JButton("Button 1");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridheight = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnButton = new JButton("Button 2");
		GridBagConstraints gbc_btnButton = new GridBagConstraints();
		gbc_btnButton.weightx = 10.0;
		gbc_btnButton.weighty = 1000.0;
		gbc_btnButton.fill = GridBagConstraints.BOTH;
		gbc_btnButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnButton.gridx = 1;
		gbc_btnButton.gridy = 1;
		contentPane.add(btnButton, gbc_btnButton);
		
		JButton btnButton_1 = new JButton("Button 3");
		GridBagConstraints gbc_btnButton_1 = new GridBagConstraints();
		gbc_btnButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnButton_1.gridx = 2;
		gbc_btnButton_1.gridy = 1;
		contentPane.add(btnButton_1, gbc_btnButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Black", "Blue", "Red", "Orange"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboBox, gbc_comboBox);
		
		txtTextfield = new JTextField();
		txtTextfield.setText("TextField");
		GridBagConstraints gbc_txtTextfield = new GridBagConstraints();
		gbc_txtTextfield.gridwidth = 2;
		gbc_txtTextfield.insets = new Insets(0, 0, 0, 5);
		gbc_txtTextfield.fill = GridBagConstraints.BOTH;
		gbc_txtTextfield.gridx = 0;
		gbc_txtTextfield.gridy = 3;
		contentPane.add(txtTextfield, gbc_txtTextfield);
		txtTextfield.setColumns(10);
		
		JTextArea txtrTextarea = new JTextArea();
		txtrTextarea.setText("TextArea2");
		GridBagConstraints gbc_txtrTextarea = new GridBagConstraints();
		gbc_txtrTextarea.fill = GridBagConstraints.BOTH;
		gbc_txtrTextarea.gridx = 2;
		gbc_txtrTextarea.gridy = 3;
		contentPane.add(txtrTextarea, gbc_txtrTextarea);
	}

}
