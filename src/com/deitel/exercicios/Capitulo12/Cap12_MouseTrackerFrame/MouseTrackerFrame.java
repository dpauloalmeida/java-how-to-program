package Cap12_MouseTrackerFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseTrackerFrame extends JFrame
{

	private JPanel MousePanel;
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
					MouseTrackerFrame frame = new MouseTrackerFrame();
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
	public MouseTrackerFrame()
	{
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event ) {
				
				lblStatusBar.setText( String.format( "Clicou em [%d, %d]", event.getX(), event.getY() ) );
			}
			
			@Override
			public void mousePressed(MouseEvent event ) {
				
				lblStatusBar.setText( String.format( "Precionou em [%d, %d]", event.getX(), event.getY() ) );
			}
			
			@Override
			public void mouseReleased(MouseEvent event ) {
				
				lblStatusBar.setText( String.format( "Liberou em {%d, %d]", event.getX(), event.getY() ) );
			}
			
			@Override
			public void mouseEntered(MouseEvent event ) {
				
				lblStatusBar.setText( String.format( "Entrou em {%d, %d]", event.getX(), event.getY() ) );
				MousePanel.setBackground( Color.LIGHT_GRAY );
			}
			
			@Override
			public void mouseExited(MouseEvent event ) {
				
				lblStatusBar.setText( "Mouse fora do painel" );
				MousePanel.setBackground( Color.WHITE );
			}
		});
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 300 );
		MousePanel = new JPanel();
		MousePanel.setBackground( Color.WHITE );
		MousePanel.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( MousePanel );
		MousePanel.setLayout(null);
		
		lblStatusBar = new JLabel("Mouse fora do painel");
		lblStatusBar.setVerticalAlignment(SwingConstants.BOTTOM);
		getContentPane().add(lblStatusBar, BorderLayout.SOUTH );
		lblStatusBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblStatusBar.setBounds(10, 228, 196, 22);
		MousePanel.add(lblStatusBar);
	}
}
