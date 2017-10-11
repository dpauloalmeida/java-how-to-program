package Cap16_13;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.HashSet;

public class Main {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		addInputByUser(list);
		
		System.out.printf("%n%nElements list without modify:%n");
		printList(list);
		
		System.out.printf("%n%nElemets list without duplicates%n");
		printListWithoutDuplicates(list);
	}
	
	private static void addInputByUser(List<String> list) {
		
		System.out.println("While is different to zero");
		System.out.print("Enter to word: ");
		String sentinel = input.next();
		
		while(!sentinel.equals("0")) {
			list.add(sentinel);
			
			System.out.print("Enter to word: ");
			sentinel = input.next();
		}
	}
	
	private static void printList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.printf("%s  ", iterator.next());
		}
	}
	
	private static void printListWithoutDuplicates(List<String> values) {
		Set<String> set = new HashSet<>(values);
		
		for(String value : set) {
			System.out.printf("%s  ", value);
		}
	}

}
