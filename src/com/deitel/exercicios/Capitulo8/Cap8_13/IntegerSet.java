package com.deitel.exercicios.Capitulo8.Cap8_13;

public class IntegerSet {
	private boolean[] set = new boolean[100];

	public IntegerSet() {
		for (int i = 0; i < 100; i++) {
			this.set[i] = false;
		}
	}

	public void insert(int number) {
		if (number < 0 || number >= 100)
			throw new IllegalArgumentException("number (" + number + ") out-of-range specified");

		this.set[number] = true;
	}

	public boolean[] getSet() {
		return set;
	}
}
