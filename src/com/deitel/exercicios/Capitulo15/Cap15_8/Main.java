package com.deitel.exercicios.Capitulo15.Cap15_8;


public class Main {

	public static void main(String[] args) {
		
		FileRead read = new FileRead();
		
		printResponse(read.getFrequency());

	}
	
	private static void printResponse(int[] freq) {
		System.out.printf("%s%14s%n", "Ranking", "Frequencia");
		
		for(int i = 1; i < freq.length; i++) {
			System.out.printf("%4d%12d%n", i, freq[i]);
		}
	}

}
