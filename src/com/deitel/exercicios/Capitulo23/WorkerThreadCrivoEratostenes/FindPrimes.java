package com.deitel.exercicios.Capitulo23.WorkerThreadCrivoEratostenes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.ExecutionException;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class FindPrimes extends JFrame {

	private final JTextField highestPrimeJTextField = new JTextField();
	private final JButton getPrimesJButton = new JButton("Get Primes");
	private final JTextArea displayPrimesJTextArea = new JTextArea();
	private final JButton cancelJButton = new JButton("Cancel");
	private final JProgressBar progressBar = new JProgressBar();
	private final JLabel statusJLabel = new JLabel();
	private PrimeCalculator calculator;

	public FindPrimes() {
		super("Finding Primes with SwingWorker");
		setLayout(new BorderLayout());

		JPanel nothJPanel = new JPanel();
		nothJPanel.add(new JLabel("Find primes less than: "));
		highestPrimeJTextField.setColumns(5);
		nothJPanel.add(highestPrimeJTextField);
		getPrimesJButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				progressBar.setValue(0);
				displayPrimesJTextArea.setText("");
				statusJLabel.setText("");

				int number;

				try {
					number = Integer.parseInt(highestPrimeJTextField.getText());
				}
				catch (NumberFormatException e) {
					statusJLabel.setText("Enter an integer.");
					return;
				}

				calculator = new PrimeCalculator(number, displayPrimesJTextArea, getPrimesJButton,
						cancelJButton, statusJLabel);

				calculator.addPropertyChangeListener(new PropertyChangeListener() {
					@Override
					public void propertyChange(PropertyChangeEvent event) {
						if (event.getPropertyName().equals("progress")) {
							int value = (Integer) event.getNewValue();
							progressBar.setValue(value);
						}
					}
				});

				getPrimesJButton.setEnabled(false);
				cancelJButton.setEnabled(true);

				calculator.execute();
			}
		});
		nothJPanel.add(getPrimesJButton);

		displayPrimesJTextArea.setEditable(false);
		add(new JScrollPane((displayPrimesJTextArea), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));

		JPanel southJPanel = new JPanel(new GridLayout(1, 3, 10, 10));
		cancelJButton.setEnabled(false);
		cancelJButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				calculator.cancel(true);
			}
		});

		southJPanel.add(cancelJButton);
		progressBar.setStringPainted(true);
		southJPanel.add(progressBar);
		southJPanel.add(statusJLabel);

		add(nothJPanel, BorderLayout.NORTH);
		add(southJPanel, BorderLayout.SOUTH);
		setBounds(400, 400, 350, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		FindPrimes app = new FindPrimes();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
