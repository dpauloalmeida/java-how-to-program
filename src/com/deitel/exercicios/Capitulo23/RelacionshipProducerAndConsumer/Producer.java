package com.deitel.exercicios.Capitulo23.RelacionshipProducerAndConsumer;

import java.security.SecureRandom;

public class Producer implements Runnable {
	private static final SecureRandom generator = new SecureRandom();
	private final Buffer sharedLocation;

	public Producer(Buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.blockingPut(i);
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		System.out.printf("%nProducer done producing%nTerminating Producer%n");
	}
}
