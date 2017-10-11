package Cap17_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Character> letter = new ArrayList<>();
		
		System.out.println("Enter to Sequence of lettes: ");
		
		addLettersToList(letter);
		
		System.out.println();
		
		letter.stream()
			  .sorted()
			  .distinct()
			  .forEach(System.out::println);
		
	}
	
	private static void addLettersToList(List<Character> list) {
		for(int next = 0; next < 10; next++) {
			String s = sc.next();
			
			list.add(s.charAt(0));
		}
	}

}
