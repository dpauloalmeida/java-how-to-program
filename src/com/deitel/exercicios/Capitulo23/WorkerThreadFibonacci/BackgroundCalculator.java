package com.deitel.exercicios.Capitulo23.WorkerThreadFibonacci;

import javax.swing.SwingWorker;
import javax.swing.JLabel;
import java.util.concurrent.ExecutionException;

public class BackgroundCalculator extends SwingWorker<Long, Object> {

	private final int n;
	private final JLabel resultLabel;

	public BackgroundCalculator(int n, JLabel resultLabel) {
		this.n = n;
		this.resultLabel = resultLabel;
	}

	@Override
	protected Long doInBackground() throws Exception {
		return fibonacci(n);
	}

	@Override
	protected void done() {
		try {
			resultLabel.setText(get().toString());
		}
		catch (InterruptedException e) {
			resultLabel.setText("Interrupted while waiting for results.");
		}
		catch (ExecutionException e) {
			resultLabel.setText("Error encountered while performing calculation.");
		}
	}

	public long fibonacci(long number) {
		if (number == 0 || number == 1) {
			return number;
		}
		else {
			return fibonacci(number -1) + fibonacci(number -2);
		}
	}
}
