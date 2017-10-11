package Cap12_JButtons_Eventos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;

public class ButtonFrame extends JFrame
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
					ButtonFrame frame = new ButtonFrame();
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
	public ButtonFrame()
	{
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 450, 300 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout(null);
		
		JButton btnPlain = new JButton("Botão Simples");
		btnPlain.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnPlain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog( ButtonFrame.this, "Você clicou no botão simples" );
			}
		});
		btnPlain.setBounds(12, 118, 151, 25);
		contentPane.add(btnPlain);
		
		Icon icon1 = new ImageIcon( "C:\\icon.png" );
		Icon icon2 = new ImageIcon( "C:\\icon1.png" );
		
		JButton btnFancy = new JButton( "Botão Elegante", icon1 );
		btnFancy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog( ButtonFrame.this, "Você clicou no botão elegante" );
			}
		});
		btnFancy.setRolloverIcon( icon2 );
		btnFancy.setBounds(169, 65, 253, 130);
		contentPane.add(btnFancy);
	}

}
