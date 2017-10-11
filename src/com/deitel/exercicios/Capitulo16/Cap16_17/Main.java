package Cap16_17;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;

public class Main {

	private static SecureRandom randomNumbers = new SecureRandom();
	private static int MAX_NUMBERS_LIST = 20;
	
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		openLinkedList(list);
		printLinkedList(list);
		printSumAndAverageOfTheList(list);
	}
	
	private static void openLinkedList(List<Integer> list) {
		
		for(int pass = 0; pass < MAX_NUMBERS_LIST; pass++) {
			addNumbersRandomInList(list);
		}
	}
	
	private static void addNumbersRandomInList(List<Integer> list) {
		list.add(randomNumbers.nextInt(100));
	}
	
	private static void printLinkedList(List<Integer> list) {
		System.out.println("List:");
		
		for(int number : list) {
			System.out.printf("%d  ", number);
		}
	}
	
	private static void printSumAndAverageOfTheList(List<Integer> list) {
		int sum = 0;
		
		for(int number: list) {
			sum += number;
		}
		
		double average = sum / MAX_NUMBERS_LIST;
		
		System.out.printf("%n%nSum: %d%nAverage: %.2f%n", sum, average);
	}
	
}
