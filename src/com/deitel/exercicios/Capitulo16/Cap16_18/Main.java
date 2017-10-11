package Cap16_18;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		Character[] chars = {'b', 'a', 'c', 'd', 'e'};
		List<Character> list1 = new LinkedList<>(Arrays.asList(chars));
		
		List<Character> list2 = new LinkedList<>(Arrays.asList(chars));
		Collections.sort(list2);

		printLinkedList(list1);
		printLinkedList(list2);
	}
	
	private static void printLinkedList(List<Character> list) {
		System.out.println("List:");
		for(char c : list) {
			System.out.printf("%c  ", c);
		}
		System.out.println();
	}
	
}
