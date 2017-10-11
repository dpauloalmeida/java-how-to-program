package com.deitel.exercicios.Capitulo8.Cap8_13;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();

		System.out.printf("Conjunto1%nDigite um número de 1 a 99:%n");
		int number = sc.nextInt();

		while (number != 100) {
			try {
				set1.insert(number);
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			number = sc.nextInt();
		}

		System.out.println();

		System.out.printf("Digite um número de 1 a 99:%n");
		number = sc.nextInt();

		while (number != 100) {
			try {
				set2.insert(number);
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

			number = sc.nextInt();
		}

		System.out.printf("%nSet Union: ");
		union(set1, set2);

		System.out.printf("%nSet Intersection: ");
		intersection(set1, set2);

		System.out.println("Encerrando...");
	}

	private static void union(IntegerSet set1, IntegerSet set2) {
		boolean[] unionSet = new boolean[100];

		for (int i = 0; i < 100; i++) {
			if (set1.getSet()[i] || set2.getSet()[i]) {
				unionSet[i] = true;
			}
		}

		printArray(unionSet);
	}

	private static void intersection(IntegerSet set1, IntegerSet set2) {
		boolean[] intersectionSet = new boolean[100];

		for (int i = 0; i < 100; i++) {
			if (set1.getSet()[i] && set2.getSet()[i]) {
				intersectionSet[i] = true;
			}
		}

		printArray(intersectionSet);
	}

	private static void printArray(boolean[] set) {
		for (int i = 0; i < 100; i++) {
			if (set[i]) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
	}
}
