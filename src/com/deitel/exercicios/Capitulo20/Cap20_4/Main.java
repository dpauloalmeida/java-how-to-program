package Cap20_4;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Integer[] numbers1 = {10, 2, 3, 4, 5};
		Double[] numbers2 = {1.2, 1.5, 10.5, 2.1, 2.5, 3.1};
		
		selectionSort(numbers1);
		printArray(numbers1);
		
		selectionSort(numbers2);
		printArray(numbers2);
	}
	
	private static <T extends Comparable<T>> void selectionSort(T[] list) {

		for(int i = 0; i < list.length - 1; i++) {
			
			int smallest = i;
			
			for(int index = i + 1; index < list.length; index++) {
				if(list[smallest].compareTo(list[index]) > 0) {
					T temporary = list[index];
					list[index] = list[smallest];
					list[smallest] = temporary;
				}
			}
		}
	}
	
	private static <T> void printArray(T[] list) {
		for(T number : list) {
			System.out.printf("%s ", number);
		}
		System.out.println();
	}

}
