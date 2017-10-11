package Cap12_TratamentoEventoTeclado;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyDemoFrame extends JFrame
{

	private JPanel contentPane;
	private String line1 = "";
	private String line2 = "";
	private String line3 = "";
	private final JTextArea textArea;
	
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
					KeyDemoFrame frame = new KeyDemoFrame();
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
	public KeyDemoFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 300 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		textArea = new JTextArea( );
		textArea.setText( "Precione uma tecla no teclado..." );
		textArea.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent event) {
				
				line1 = String.format( "Key pressed: %s", KeyEvent.getKeyText( event.getKeyCode() ) );
				
				setLine2and3( event );
			}
			
			@Override
			public void keyReleased(KeyEvent event ) {
				
				line1 = String.format( "Key released: %s", KeyEvent.getKeyText( event.getKeyCode() ) );
				
				setLine2and3( event );
			}
			
			@Override
			public void keyTyped(KeyEvent event ) {
				
				line1 = String.format( "Key typed: %s", event.getKeyChar() );
				
				setLine2and3( event );
			}
		});
		textArea.setBounds(10, 11, 414, 239);
		contentPane.add(textArea);
	}
	
	private void setLine2and3( KeyEvent event )
	{
		line2 = String.format( "This key is %san action key", ( event.isActionKey() ? "" : "not " ) );
		
		String temp = KeyEvent.getKeyModifiersText( event.getModifiers() );
		
		line3 = String.format( "Modifier keys pressed: %s", ( temp.equals( "" ) ? "none" : temp ) );
		
		textArea.setText( String.format( "%s%n%s%n%s%n", line1, line2, line3) );
	}
}
