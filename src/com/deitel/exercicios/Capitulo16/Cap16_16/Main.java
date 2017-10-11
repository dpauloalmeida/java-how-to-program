package Cap16_16;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		createMap(map);
		printMap(map);
	}
	
	private static void createMap(Map<String, Integer> map) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter to text: ");
		String text = sc.nextLine();
		
		String[] tokens = text.split(" ");
		
		for(String token : tokens) {
			processesTheWordsOfTheTextOfInput(map, token);
		}
	}
	
	private static void processesTheWordsOfTheTextOfInput(Map<String, Integer> map, String token) {
		String word = token.toLowerCase();
		
		if(wordContainsInMap(map, word)) {
			incrementOneToValueOfWordInMap(map, word);
		}
		else {
			addNewWordWithValueOneInMap(map, word);
		}		
	}
	
	private static boolean wordContainsInMap(Map<String, Integer> map, String word) {
		return map.containsKey(word);
	}
	
	private static void incrementOneToValueOfWordInMap(Map<String, Integer> map, String word) {
		map.put(word, map.get(word) + 1);
	}
	
	private static void addNewWordWithValueOneInMap(Map<String, Integer> map, String word) {
		map.put(word, 1);
	}
	
	private static void printMap(Map<String, Integer> map) {
		Set<String> set = map.keySet();
		
		TreeSet<String> oderWords = new TreeSet<>(set);
		
		System.out.printf("%nMap conteins:%nKey\t\tValue%n");
		for(String word : oderWords) {
			if(wordIsDuplicate(map, word))
				System.out.printf("%-10s%10d%n", word, map.get(word));
		}
	}
	
	private static boolean wordIsDuplicate(Map<String, Integer> map, String word) {
		return map.get(word) > 1;
	}
}
