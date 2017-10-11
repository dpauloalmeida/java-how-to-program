package Cap22_11_12_13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class SelectColorJSlider extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JSlider slider;
	private JSlider slider_1;
	private JSlider slider_2;
	private JDesktopPane desktopPane;
	private JButton btnNewButton;
	private JMenuBar menuBar;

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
					SelectColorJSlider frame = new SelectColorJSlider();
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
	public SelectColorJSlider()
	{
		Rectangle rectangle = new Rectangle();
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 560 );
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setMnemonic('f');
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				System.exit( 0 );
			}
		});
		mntmExit.setMnemonic('x');
		mnNewMenu.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{350, 72, 0};
		gbl_contentPane.rowHeights = new int[]{333, 26, 26, 26, 25, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		slider = new JSlider( SwingConstants.HORIZONTAL, 0, 255, 0 );
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				String s = String.format( "%d", slider.getValue() );
				
				textField.setText( s );
				
				rectangle.setSliderColor( slider.getValue(), 
						slider_1.getValue(), slider_2.getValue() );
				
			//	rectangle.setBackground( new Color( slider.getValue(), 
				//		slider_1.getValue(), slider_2.getValue() ) );
			}
		});
		
		desktopPane = new JDesktopPane();
		GridBagConstraints gbc_desktopPane = new GridBagConstraints();
		gbc_desktopPane.fill = GridBagConstraints.BOTH;
		gbc_desktopPane.insets = new Insets(0, 0, 5, 0);
		gbc_desktopPane.gridwidth = 2;
		gbc_desktopPane.gridx = 0;
		gbc_desktopPane.gridy = 0;
		contentPane.add(desktopPane, gbc_desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		desktopPane.add( rectangle );
		rectangle.setLayout(new BorderLayout(0, 0));
		GridBagConstraints gbc_slider = new GridBagConstraints();
		gbc_slider.weightx = 1.0;
		gbc_slider.fill = GridBagConstraints.BOTH;
		gbc_slider.insets = new Insets(0, 0, 5, 5);
		gbc_slider.gridx = 0;
		gbc_slider.gridy = 1;
		contentPane.add(slider, gbc_slider);
		
		slider_2 = new JSlider( SwingConstants.HORIZONTAL, 0, 255, 0 );
		slider_2.setMajorTickSpacing(20);
		slider_2.setPaintTicks(true);
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				String s = String.format( "%d", slider_2.getValue() );
				
				textField_2.setText( s );
				
				rectangle.setSliderColor( slider.getValue(), 
						slider_1.getValue(), slider_2.getValue() );
				
			//	rectangle.setBackground( new Color( slider.getValue(), 
				//		slider_1.getValue(), slider_2.getValue() ) );
			}
		});
		
		textField = new JTextField( "0" );
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		slider_1 = new JSlider( SwingConstants.HORIZONTAL, 0, 255, 0 );
		slider_1.setMajorTickSpacing(20);
		slider_1.setPaintTicks(true);
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				String s = String.format( "%d", slider_1.getValue() );
				
				textField_1.setText( s );
				
				rectangle.setSliderColor( slider.getValue(), 
						slider_1.getValue(), slider_2.getValue() );
				
			//	rectangle.setBackground( new Color( slider.getValue(), 
				//		slider_1.getValue(), slider_2.getValue() ) );
			}
		});
		GridBagConstraints gbc_slider_1 = new GridBagConstraints();
		gbc_slider_1.weightx = 1.0;
		gbc_slider_1.fill = GridBagConstraints.BOTH;
		gbc_slider_1.insets = new Insets(0, 0, 5, 5);
		gbc_slider_1.gridx = 0;
		gbc_slider_1.gridy = 2;
		contentPane.add(slider_1, gbc_slider_1);
		
		textField_1 = new JTextField( "0" );
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		GridBagConstraints gbc_slider_2 = new GridBagConstraints();
		gbc_slider_2.weightx = 1.0;
		gbc_slider_2.fill = GridBagConstraints.BOTH;
		gbc_slider_2.insets = new Insets(0, 0, 5, 5);
		gbc_slider_2.gridx = 0;
		gbc_slider_2.gridy = 3;
		contentPane.add(slider_2, gbc_slider_2);
		
		textField_2 = new JTextField( "0" );
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		contentPane.add(textField_2, gbc_textField_2);
		
		btnNewButton = new JButton("Mudar Cor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				try
				{
					slider.setValue( Integer.parseInt( textField.getText() ) );				
					slider_1.setValue( Integer.parseInt( textField_1.getText() ) );
					slider_2.setValue( Integer.parseInt(  textField_2.getText() ) );
				}
				catch( Exception e )
				{
					JOptionPane.showMessageDialog( SelectColorJSlider.this, "Inválido", 
							"Message", JOptionPane.ERROR_MESSAGE );
					
					textField.setText( String.format( "%d", slider.getValue() ) );
					textField_1.setText( String.format( "%d", slider_1.getValue() ) );
					textField_2.setText( String.format( "%d", slider_2.getValue() ) );
				}
				
				desktopPane.setBackground( new Color( slider.getValue(), 
						slider_1.getValue(), slider_2.getValue() ) );
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weightx = 1.0;
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 4;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}
}
