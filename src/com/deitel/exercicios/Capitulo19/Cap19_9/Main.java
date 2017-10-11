package com.deitel.exercicios.Capitulo19.Cap19_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.toString(data));
		
		System.out.print("Enter to value (-1 to quit): ");
		int seachInt = sc.nextInt();
		
		while(seachInt != -1) {
			int posicion = binarySeach(data, 0, data.length - 1, seachInt);
			
			if(posicion == -1) {
				System.out.printf("%d was not found %n%n", seachInt);
			}
			else {
				System.out.printf("%d was found in posicion %d%n%n", seachInt, posicion);
			}
			
			System.out.print("Enter to value (-1 to quit): ");
			seachInt = sc.nextInt();
		}
		
		System.exit(0);
	}

	private static int binarySeach(int[] data, int low, int high, int key) {	
		if(low < high) {	
			int middle = (low + high + 1) / 2;

			if(data[middle] == key) {
				return middle;
			}
			else if (data[middle] > key) {
				return binarySeach(data, low, middle - 1, key);
			}
			else {
				return binarySeach(data, middle + 1, high, key);
			}
		}
		return -1;
	}
	
}
