package Cap12_JList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ListFrame extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main( String[] args )
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater( new Runnable()
		{
			public void run()
			{
				try
				{
					ListFrame frame = new ListFrame();
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
	public ListFrame()
	{
		final Color[] colors = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
								 Color.GRAY, Color.LIGHT_GRAY, Color.GREEN, Color.MAGENTA,
								 Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 378, 178 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				
				getContentPane().setBackground( colors[ list.getSelectedIndex() ] );
			}
		});
		list.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		list.setVisibleRowCount(5);
		list.setToolTipText( "Lista de cores" );
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Preto", "Azul", "Ciano", "Cinza Escuro", 
											"Cinza", "Cinza Claro", "Verde", "Magenta", 
											"Laranja", "Rosa", "Vermelho", "Branco", "Amarelo"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane(list);
		contentPane.add(scrollPane);
	}
}
