package com.deitel.exercicios.Capitulo18.Cap18_23;

import java.math.BigInteger;

public class Main {

	private static BigInteger TWO = BigInteger.valueOf(2);
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		for(int count = 0; count <= 50; count++) {
			System.out.printf("%d is: %d%n", count, fibonacci(BigInteger.valueOf(count)));
		}
		
		long end = System.currentTimeMillis();

		System.out.printf("Tempo: %.2f segundos%n", (double)((end - start) / 1000));
	}

	private static BigInteger fibonacci(BigInteger number) {
		if(number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE)) {
			return number;
		}
		else {
			return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
		}
	}
	
}
