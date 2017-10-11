package com.deitel.exercicios.Capitulo16.Cap16_21;

import java.util.Comparator;

public class Descending implements Comparator<Double>{

	@Override
	public int compare(Double d1, Double d2) {
		return Double.compare(d2, d1);
	}

}
