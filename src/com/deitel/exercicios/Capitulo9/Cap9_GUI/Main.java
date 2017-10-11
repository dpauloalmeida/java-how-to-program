package Cap9_GUI;


import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Main
{

	public static void main( String[] args )
	{
		// cria um rótulo com texto simples
		JLabel northLabel = new JLabel( "North" );
		
		// cria um ícone de uma imagem para podermos colocar em um JLabel
		//ImageIcon labelIcon = new ImageIcon( "c:\GUI.gif" );

		JLabel southLabel = new JLabel( "Maria" );
		
		southLabel.setText( "South" );
		
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		app.add( northLabel, BorderLayout.NORTH );
		app.add( southLabel, BorderLayout.SOUTH );
		
		app.setSize( 300, 300 );
		app.setVisible( true );
	}

}
