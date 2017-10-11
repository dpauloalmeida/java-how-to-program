package com.deitel.exercicios.Capitulo16.Cap16_20;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;

public class Main {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.print("Enter to text: ");
		String text = sc.nextLine();
		
		String[] tokens = text.split(" ");
		
		TreeSet<String> tree = new TreeSet<>(Arrays.asList(tokens));
		
		for(String word : tree) {
			System.out.printf("%s  ", word.toLowerCase());
		}
	}

}
