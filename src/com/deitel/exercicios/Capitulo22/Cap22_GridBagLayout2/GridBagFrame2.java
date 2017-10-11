package Cap22_GridBagLayout2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;


public class GridBagFrame2 extends JFrame
{
	private JTextField textField1;

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
					GridBagFrame2 frame = new GridBagFrame2();
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
	public GridBagFrame2()
	{
		super( "GridBagLayout2" );
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 300, 240 );
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 100, 100};
		gridBagLayout.rowHeights = new int[]{40, 40, 0, 40, 40, 40};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		textField1 = new JTextField();
		textField1.setText("TextField");
		GridBagConstraints gbc_textField1 = new GridBagConstraints();
		gbc_textField1.gridwidth = GridBagConstraints.REMAINDER;
		gbc_textField1.insets = new Insets(0, 0, 5, 0);
		gbc_textField1.fill = GridBagConstraints.BOTH;
		gbc_textField1.gridx = 0;
		gbc_textField1.gridy = 0;
		getContentPane().add(textField1, gbc_textField1);
		textField1.setColumns(10);
		
		JButton btnZero = new JButton("zero");
		GridBagConstraints gbc_btnZero = new GridBagConstraints();
		gbc_btnZero.fill = GridBagConstraints.BOTH;
		gbc_btnZero.weighty = 1.0;
		gbc_btnZero.weightx = 1.0;
		gbc_btnZero.insets = new Insets(0, 0, 5, 5);
		gbc_btnZero.gridx = 0;
		gbc_btnZero.gridy = 1;
		getContentPane().add(btnZero, gbc_btnZero);
		
		JButton btnOne = new JButton("one");
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.fill = GridBagConstraints.BOTH;
		gbc_btnOne.gridwidth = GridBagConstraints.RELATIVE;
		gbc_btnOne.weightx = 1.0;
		gbc_btnOne.weighty = 1.0;
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 1;
		gbc_btnOne.gridy = 1;
		getContentPane().add(btnOne, gbc_btnOne);
		
		JButton btnTwo = new JButton("two");
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.weighty = 1.0;
		gbc_btnTwo.weightx = 1.0;
		gbc_btnTwo.fill = GridBagConstraints.BOTH;
		gbc_btnTwo.gridwidth = GridBagConstraints.REMAINDER;
		gbc_btnTwo.insets = new Insets(0, 0, 5, 0);
		gbc_btnTwo.gridx = 2;
		gbc_btnTwo.gridy = 1;
		getContentPane().add(btnTwo, gbc_btnTwo);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 2;
		getContentPane().add(separator, gbc_separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Black", "Green", "Red", "Blue", "Orange"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.weightx = 1.0;
		gbc_comboBox.gridwidth = GridBagConstraints.REMAINDER;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 3;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JButton btnNewButton = new JButton("three");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weighty = 1.0;
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridwidth = GridBagConstraints.REMAINDER;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 4;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("four");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.weighty = 1.0;
		gbc_btnNewButton_1.weightx = 1.0;
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 5;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		JList btnNewButton_2 = new JList<>();
		btnNewButton_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Serif", "Monospaced"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridwidth = GridBagConstraints.REMAINDER;
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 5;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
	}
}