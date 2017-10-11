package Cap19_7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array1 = {10, 12, 56, 98, 58, 41, 23, 87, 60, 100, 40, 34, 21, 45, 88};
		int[][] array2 = new int[10][array1.length];

		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array1.length; j++) {
				array2[i][j] = 0;
			}
		}
		
		sort(array1, array2);
		
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array1.length; j++) {
				System.out.printf("%3d  ", array2[i][j]);
			}
			System.out.println();
		}
	}
	
	private static void sort(int[] array1, int[][] array2) {
		for(int row = 0; row < array2.length; row++) {
			int column = 0;
			for(int index = 0; index < array1.length; index++) {
				if(array2[row][column] == 0 && row == array1[index] % 10) {
					array2[row][column] = array1[index];
					++column;
				}
				
			}
				
		}
	}

}
