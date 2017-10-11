package com.deitel.exercicios.Capitulo23.WorkerThreadCrivoEratostenes;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingWorker;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class PrimeCalculator extends SwingWorker<Integer, Integer> {

	private static final SecureRandom genarator = new SecureRandom();
	private final JTextArea intermediateJTextArea;
	private final JButton getPrimesJButton;
	private final JButton cancelJButton;
	private final JLabel statusJLabel;
	private final boolean[] primes;

	public PrimeCalculator(int max, JTextArea intermediateJTextArea, JButton getPrimesJButton,
						   JButton cancelJButton, JLabel statusJLabel) {
		this.intermediateJTextArea = intermediateJTextArea;
		this.getPrimesJButton = getPrimesJButton;
		this.cancelJButton = cancelJButton;
		this.statusJLabel = statusJLabel;
		this.primes = new boolean[max];

		Arrays.fill(primes, true);
	}

	@Override

	protected Integer doInBackground() {
		int count = 0;

		for (int i = 2; i < primes.length; i++) {
			if (isCancelled()) {
				return count;
			}
			else {
				setProgress(100 * (i + 1) / primes.length);

				try {
					Thread.sleep(genarator.nextInt(5));
				}
				catch (InterruptedException e) {
					statusJLabel.setText("Worker thread interrupted");
					return count;
				}

				if (primes[i]) {
					publish(i);
					++count;

					for (int j = i + i; j < primes.length; j += i) {
						primes[j] = false;
					}
				}
			}
		}
		return count;
	}

	@Override
	protected void process(List<Integer> publishedValues) {
		for (int i = 0; i < publishedValues.size(); i++) {
			intermediateJTextArea.append(publishedValues.get(i) + "\n");
		}
	}

	@Override
	protected void done() {
		getPrimesJButton.setEnabled(true);
		cancelJButton.setEnabled(false);

		try {
			statusJLabel.setText("Found " + get() + " primes");
		}
		catch (InterruptedException | ExecutionException | CancellationException e) {
			statusJLabel.setText(e.getMessage());
		}
	}
}
