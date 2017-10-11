package Cap13_15;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Cap12_JButtons_Eventos.ButtonFrame;
import Cap13_11_12.GridDrawLine;

public class Main
{

	public static void main( String[] args )
	{
		JFrame app = new JFrame( "Grid" );
		JFrame app2 = new JFrame();
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		app.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		CreateCircle circle = new CreateCircle(	35 );
		app2.add( circle );
		app.setBounds( 400, 400, 500, 500 );
		app.setVisible( true );
		
		app2.setBounds( 400, 400, 500, 500 );
		app2.setVisible( true );
		
		JButton btnPlain = new JButton("Botão Simples");
		btnPlain.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnPlain.setBounds(12, 118, 151, 25);
		app.add(btnPlain);
	}

}
