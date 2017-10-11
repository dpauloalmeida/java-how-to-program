package Cap12_MutipleSelectionFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class MutipleSelectionFrame extends JFrame
{

	private JPanel contentPane;
	private final JList list_1;
	
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
					MutipleSelectionFrame frame = new MutipleSelectionFrame();
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
	public MutipleSelectionFrame()
	{
		
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 177 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList();
		list.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		list.setVisibleRowCount(5);
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
		
		JScrollPane scrollPane = new JScrollPane( list );
		contentPane.add(scrollPane);
		
		JButton btnCopiar = new JButton("Copiar >>>");
		btnCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				list_1.setListData( list.getSelectedValuesList().toArray( new String[0] ) );
			}
		});
		contentPane.add(btnCopiar);
		
		list_1 = new JList();
		list_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		list_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list_1.setVisibleRowCount(5);
		list_1.setFixedCellWidth( 110 );
		list_1.setFixedCellHeight( 15 );
		contentPane.add(list_1);
		
		JScrollPane scrollPane_1 = new JScrollPane( list_1 );
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane_1);
	}

}
