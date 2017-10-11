package Cap12_FlowLayout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlowLayoutFrame extends JFrame
{

	private JPanel contentPane;
	private Container container;
	private FlowLayout layout;
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
					FlowLayoutFrame frame = new FlowLayoutFrame();
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
	public FlowLayoutFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 85 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		JButton btnLeft = new JButton("Left");
		btnLeft.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				
				contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));	
				setContentPane( contentPane );
			}
		});
		contentPane.add(btnLeft);
		
		JButton btnCenter = new JButton("Center");
		btnCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event ) {
				
				contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				setContentPane( contentPane );
			}
		});
		contentPane.add(btnCenter);
		
		JButton btnRight = new JButton("Right");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
				setContentPane( contentPane );
			}
		});
		contentPane.add(btnRight);
	}

}
