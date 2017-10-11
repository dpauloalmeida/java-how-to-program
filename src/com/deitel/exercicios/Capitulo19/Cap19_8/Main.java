package Cap19_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int[] data = { 2, 3, 4, 5, 7, 8, 9, 10, 1, 6};
		
		System.out.println(Arrays.toString(data));
		
		System.out.print("Enter to value (-1 to quit): ");
		int seachInt = sc.nextInt();
		
		while(seachInt != -1) {
			int posicion = linearSeach(data, 0, seachInt);
			
			if(posicion == -1) {
				System.out.printf("%d was not found %d%n%n", seachInt, posicion);
			}
			else {
				System.out.printf("%d was found in posicion %d%n%n", seachInt, posicion);
			}
			
			System.out.print("Enter to value (-1 to quit): ");
			seachInt = sc.nextInt();
		}
		
		System.exit(0);
	}
	
	private static int linearSeach(int[] data, int index, int searchKey) {
		if(index < data.length) {
			if(data[index] == searchKey) {
				return index;
			}
			else {
				return linearSeach(data, index + 1, searchKey);
			}
		}
		return -1;
	}
	
}
