package Cap22_MenuFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuFrame extends JFrame
{

	private JPanel contentPane;
	private final JLabel displayLabel;
	private final ButtonGroup colorButtonGroup = new ButtonGroup();
	private final ButtonGroup fontButtonGroup = new ButtonGroup();
	
	private final JRadioButtonMenuItem[] itens;
	private int style;
	private String font;
	
	private JCheckBoxMenuItem boldStyleItem;
	private JCheckBoxMenuItem italicStyleItem;
	private final ButtonGroup backgroundButtonGroup = new ButtonGroup();
	private final Color[] colorValues = { Color.BLUE, Color.YELLOW, Color.RED };

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
					MenuFrame frame = new MenuFrame();
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
	public MenuFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 400, 400, 500, 200 );
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		menuBar.add(fileMenu);
		
		JMenuItem aboutItem = new JMenuItem("About...");
		aboutItem.setMnemonic('A');
		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				JOptionPane.showMessageDialog( MenuFrame.this,
						"Este é um exemplo\nde como usar menus",
						"About", JOptionPane.PLAIN_MESSAGE );
			}
		});
		fileMenu.add(aboutItem);
		
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				System.exit( 0 );
			}
		});
		fileMenu.add(exitItem);
		
		JMenu formatMenu = new JMenu("Format");
		formatMenu.setMnemonic('r');
		menuBar.add(formatMenu);
		
		JMenu colorMenu = new JMenu("Color");
		colorMenu.setMnemonic('C');
		formatMenu.add(colorMenu);
		formatMenu.addSeparator();
		
		JRadioButtonMenuItem blackColorItem = new JRadioButtonMenuItem("Black\r\n");
		blackColorItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				displayLabel.setForeground( Color.BLACK );
			}
		});
		blackColorItem.setSelected(true);
		colorButtonGroup.add(blackColorItem);
		blackColorItem.setName("");
		colorMenu.add(blackColorItem);
		
		JRadioButtonMenuItem blueColorItem = new JRadioButtonMenuItem("Blue");
		blueColorItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				displayLabel.setForeground( Color.BLUE );
			}
		});
		colorButtonGroup.add(blueColorItem);
		colorMenu.add(blueColorItem);
		
		JRadioButtonMenuItem redColorItem = new JRadioButtonMenuItem("Red");
		redColorItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				displayLabel.setForeground( Color.RED );
			}
		});
		colorButtonGroup.add(redColorItem);
		colorMenu.add(redColorItem);
		
		JRadioButtonMenuItem greenColorItem = new JRadioButtonMenuItem("Green");
		greenColorItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				displayLabel.setForeground( Color.GREEN );
			}
		});
		colorButtonGroup.add(greenColorItem);
		colorMenu.add(greenColorItem);
		
		JMenu fontMenu = new JMenu("Font");
		fontMenu.setMnemonic('n');
		formatMenu.add(fontMenu);
		
		JRadioButtonMenuItem serifFontItem = new JRadioButtonMenuItem("Serif");
		serifFontItem.setSelected(true);
		fontButtonGroup.add(serifFontItem);
		serifFontItem.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent event )
			{
				font = "Serif";
				displayLabel.setFont( new Font( font, style, 72) );
			}
		});
		fontMenu.add(serifFontItem);
		
		JRadioButtonMenuItem monospacedFontItem = new JRadioButtonMenuItem("Monospaced");
		fontButtonGroup.add(monospacedFontItem);
		monospacedFontItem.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent event ) {
				
				font = "Monospaced";
				displayLabel.setFont( new Font( font, style, 72) );
			}
		});
		fontMenu.add(monospacedFontItem);
		
		JRadioButtonMenuItem seansserifFontItem = new JRadioButtonMenuItem("SensSerif");
		fontButtonGroup.add(seansserifFontItem);
		seansserifFontItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				font = "sensSerif";
				displayLabel.setFont( new Font( font, style, 72) );
			}
		});
		fontMenu.add(seansserifFontItem);
		fontMenu.addSeparator();
		
		boldStyleItem = new JCheckBoxMenuItem("Bold");
		boldStyleItem.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				
				style = Font.PLAIN;
				
				if( boldStyleItem.isSelected() && italicStyleItem.isSelected() )
				{
					style = Font.BOLD + Font.ITALIC;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}
				else if( boldStyleItem.isSelected() )
				{
					style = Font.BOLD;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}
				else if( italicStyleItem.isSelected() )
				{
					style = Font.ITALIC;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}
				else
				{
					style = Font.PLAIN;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}

			}
		});
		fontMenu.add(boldStyleItem);
		
		italicStyleItem = new JCheckBoxMenuItem("Italic");
		italicStyleItem.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				
				style = Font.PLAIN;
				
				if( boldStyleItem.isSelected() && italicStyleItem.isSelected() )
				{
					style = Font.BOLD + Font.ITALIC;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}
				else if( boldStyleItem.isSelected() )
				{
					style = Font.BOLD;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}
				else if( italicStyleItem.isSelected() )
				{
					style = Font.ITALIC;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}
				else
				{
					style = Font.PLAIN;
					displayLabel.setFont( new Font( font, style, 72 ) );
				}

			}
		});
		fontMenu.add(italicStyleItem);
		
		JMenu mnBackground = new JMenu("Background");
		formatMenu.add(mnBackground);
		
		JRadioButtonMenuItem cyanBackgroundItem = new JRadioButtonMenuItem("Cyan");
		cyanBackgroundItem.setSelected(true);
		backgroundButtonGroup.add(cyanBackgroundItem);
		cyanBackgroundItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				contentPane.setBackground( Color.CYAN );
			}
		});
		mnBackground.add(cyanBackgroundItem);
		
		JRadioButtonMenuItem orangeBackgroundItem = new JRadioButtonMenuItem("Orange");
		backgroundButtonGroup.add(orangeBackgroundItem);
		orangeBackgroundItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				contentPane.setBackground( Color.ORANGE );
			}
		});
		mnBackground.add(orangeBackgroundItem);
		
		JRadioButtonMenuItem whiteBackgroundItem = new JRadioButtonMenuItem("White");
		backgroundButtonGroup.add(whiteBackgroundItem);
		whiteBackgroundItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			
				contentPane.setBackground( Color.WHITE );
			}
		});
		mnBackground.add(whiteBackgroundItem);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(new BorderLayout(0, 0));
		
		displayLabel = new JLabel("Sample Text");
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 72));
		displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(displayLabel);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(displayLabel, popupMenu);
		
		itens = new JRadioButtonMenuItem[ colorValues.length ];
		ButtonGroup colorButtonGroup2 = new ButtonGroup();
		String[] colors = { "Blue", "Yellow", "Red" };
		ItemHandler handler = new ItemHandler();
		
		for( int count = 0; count < colorValues.length; count ++ )
		{
			itens[ count ] = new JRadioButtonMenuItem( colors[ count ] );
			popupMenu.add( itens[ count ] );
			colorButtonGroup.add( itens[ count ] );
			itens[ count ].addActionListener( handler );
		}
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	private class ItemHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			for( int i = 0; i < itens.length; i++ )
			{
				if( event.getSource() == itens[ i ] )
					contentPane.setBackground( colorValues[ i ] );
			}
		}
	}
}