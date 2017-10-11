package Cap12_MouseDetailsFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDetailsFrame extends JFrame
{

	private JPanel contentPane;
	private String details;
	private final JLabel lblStatusBar;
	
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
					MouseDetailsFrame frame = new MouseDetailsFrame();
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
	public MouseDetailsFrame()
	{
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent event) {
				
				int xPos = event.getX();
				int yPos = event.getY();
				
				details = String.format( "Clicou %d time(s)", event.getClickCount() );
				
				if( event.isMetaDown() )
					details += "Com botão direito do mouse";
				else if( event.isAltDown() )
					details += "Com botão central do mouse";
				else
					details += "Com o botão esquedo do mouse";
				
				lblStatusBar.setText( details );
			}
		});
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 300 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		lblStatusBar = new JLabel("Clique no mouse");
		lblStatusBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblStatusBar.setBounds(10, 236, 268, 14);
		contentPane.add(lblStatusBar, BorderLayout.SOUTH);
		
	}
}
