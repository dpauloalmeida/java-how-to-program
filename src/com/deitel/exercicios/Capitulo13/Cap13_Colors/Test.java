package Cap13_Colors;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JColorChooser;

public class Test extends JFrame
{

	private JPanel contentPane;
	private Color color = Color.LIGHT_GRAY;
	
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
		setTitle("Usando JColorChooser");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 400, 400, 450, 218 );
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		
		JButton btnMudarCor = new JButton("Mudar Cor");
		btnMudarCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				color = JColorChooser.showDialog( Test.this, "Ecolha uma cor", color );
				
				if( color == null )
					color = new Color( 240, 240, 240 );
				
				contentPane.setBackground( color );
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(btnMudarCor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap(141, Short.MAX_VALUE)
					.addComponent(btnMudarCor))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
