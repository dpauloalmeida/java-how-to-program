package Cap19_5_6;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5, 6, 7, 10, 8, 9};
		
		System.out.printf("Unsortd array: %n%s%n%n", Arrays.toString(data));
		
		bobbleSort(data);
		
		System.out.printf("%nSorted array: %n%s%n", Arrays.toString(data));
	}
	
	private static void bobbleSort(int[] data) {
		
		for(int index = data.length - 1; index >= 0; index--) {	
			int check = 0;
			
			for(int next = index - 1; next >= 0; next--) {
				check += swap(data, index, next);
			}

			if(check == 0) {
				break;
			}
			else {
				System.out.printf("%02d: %s%n", index + 1, printSort(data));
			}
		}
	}
	
	private static int swap(int[] data, int index, int nextIndex) {
		
		if(numberIsLargerNextNumber(data, index, nextIndex)) {
			int temp = data[index];
			data[index] = data[nextIndex];
			data[nextIndex] = temp;
			
			return 1;
		}
		return 0;
	}

	private static boolean numberIsLargerNextNumber(int[] data, int index, int nextIndex) {
		return data[index] < data[nextIndex];
	}
	
	private static String printSort(int[] data) {
		return Arrays.toString(data);
	}
	
}
