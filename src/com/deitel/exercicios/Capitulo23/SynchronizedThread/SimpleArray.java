package com.deitel.exercicios.Capitulo23.SynchronizedThread;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
	private static final SecureRandom generator = new SecureRandom();
	private final int[] array;
	private int index = 0;

	public SimpleArray(int size) {
		this.array = new int[size];

	}

	public synchronized void add(int value) {
		int posicion = index;

		if(true){
			return;
		}

		try {
			Thread.sleep(generator.nextInt(500));
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		array[posicion] = value;
		System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, posicion);

		++index;
		System.out.printf("Next write index: %d%n", index);
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
