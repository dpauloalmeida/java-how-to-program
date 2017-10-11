package com.deitel.exercicios.Capitulo23.Cap23_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawBall extends JPanel implements Runnable {
	final ArrayList<Point> points = new ArrayList<>();
	private int pointX = 0;
	private int pointY = 0;

	public DrawBall(int pointX, int pointY) {
		this.pointX = pointX;
		this.pointY = pointY;
	}

	public void setPointX(int pointX) {
		this.pointX = pointX;
	}

	public void setPointY(int pointY) {
		this.pointY = pointY;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLUE);

		g.fillOval(pointX, pointY, 100, 100);

	}

	@Override
	public void run() {
		final ArrayList<Point> points = new ArrayList<>();

		addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent event) {
				points.add(event.getPoint());

				for (Point point : points) {
					setPointX(point.x);
					setPointY(point.y);
				}

				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

		});
	}
}
