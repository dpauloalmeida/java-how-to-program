package Cap16_14;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		createMap(map);
		printMap(map);
	}
	
	private static void createMap(Map<String, Integer> map) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter to string: " );
		String text = sc.nextLine();
		
		String[] tokens = text.replaceAll(" ", "").split("");
		
		for(String token : tokens) {
			processesTheCharsOfTheTextOfInput(map, token);
		}	
	}
	
	private static void processesTheCharsOfTheTextOfInput(Map<String, Integer> map, String token) {
		String c = token.toLowerCase();
		
		if(charContainsInMap(map, c)) {
			incrementOneToValueOfTheCharInMap(map, c);	
		} 
		else {
			addNewCharWithValueOneInMap(map, c);
		}	
	}
	
	private static boolean charContainsInMap(Map<String, Integer> map, String c) {
		return map.containsKey(c);
	}
	
	private static void incrementOneToValueOfTheCharInMap(Map<String, Integer> map, String c) {
		map.put(c, map.get(c) + 1);
	}
	
	private static void addNewCharWithValueOneInMap(Map<String, Integer> map, String c) {
		map.put(c, 1);
	}

	private static void printMap(Map<String, Integer> map) {
		Set<String> set = map.keySet();
		
		TreeSet<String> sortedKeys = new TreeSet<>(set);
		
		System.out.printf("%nMap contains:%nKey\tValue%n");
		
		for(String key : sortedKeys) {
			System.out.printf("%-10s%s%n", key, map.get(key));
		}
		
		System.out.printf("%nSize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
	}
	
}
