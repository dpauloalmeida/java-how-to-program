package com.deitel.exercicios.Capitulo23.Cap23_11;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BallTest {

	public static void main(String[] args) {
		final ArrayList<Point> points = new ArrayList<>();

		JFrame app = new JFrame();
		DrawBall panel = new DrawBall(0,0);

		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(panel);

		service.shutdown();

		app.add(panel);
		app.setBounds(400, 400, 500, 500);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}


}
