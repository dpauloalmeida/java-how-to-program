package Cap12_Tratamento_Eventos_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class Test extends JFrame
{

	private JPanel contentPane;
	private JTextField textField1;
	private JFormattedTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;

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
					Test frame = new Test();
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
	public Test()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 194 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout( null );
		
		textField1 = new JTextField( 10 );
		textField1.setBounds(12, 13, 410, 22);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JFormattedTextField();
		textField2.setText("Entre com o texto aqui");
		textField2.setBounds(12, 48, 410, 22);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField( "Texto não editavel", 21 );
		textField3.setEditable( false );
		textField3.setBounds(12, 83, 410, 22);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		passwordField = new JPasswordField( "Texto oculto" );
		passwordField.setBounds(12, 118, 410, 20);
		contentPane.add(passwordField);
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener( handler );
		textField2.addActionListener( handler );
		textField3.addActionListener( handler );
		passwordField.addActionListener( handler );
	}

	private class TextFieldHandler implements ActionListener
	{
		@Override
		public void actionPerformed( ActionEvent event )
		{
			String s = "";
			
			if( event.getSource() == textField1 )
				s = String.format( "textField1: %s", event.getActionCommand() );
			
			if( event.getSource() == textField2 )
				s = String.format( "textField2: %s", event.getActionCommand() );
			
			if( event.getSource() == textField3 )
				s = String.format( "textField3: %s", event.getActionCommand() );
			
			if( event.getSource() == passwordField )
				s = String.format( "passwordField: %s", event.getActionCommand() );
			
			JOptionPane.showMessageDialog( null, s );
		}
	}
}
