package Cap16_12;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		String[] colors1 = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<>(Arrays.asList(colors1));
		
		String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<>(Arrays.asList(colors2));
		
		concatLists(list1, list2);
		
		list2 = null;

		convertToUpperCase(list1);	
		printList(list1);
		
		System.out.printf("%nDeleting elemets 4 to 6...%n");
		removeItems(list1, 4, 7);
		printList(list1);
		
		System.out.printf("%nInverse elemets%n");
		printReversedList(list1);
	}
	
	private static void concatLists(List<String> list1, List<String> list2) {
		list1.addAll(list2);
	}
	
	private static void printList(List<String> list) {
		System.out.printf("List:%n");
		
		for(String color : list) {
			System.out.printf("%s ", color);
		}
		System.out.println();
	}
	
	private static void convertToUpperCase(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}
	
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}

	private static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
	}
	
}
