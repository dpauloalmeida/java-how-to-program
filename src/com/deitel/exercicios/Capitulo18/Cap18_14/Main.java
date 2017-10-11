package Cap18_14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ente to word: ");
		String word = sc.nextLine();
		
		word.replaceAll(" ", "");
		
		System.out.println(testPalindrome(word, 0, 5));
	}
	
	private static boolean testPalindrome(String s, int i, int f) {
		if(i < f) {
			if(s.charAt(i) == s.charAt(f)) {
				testPalindrome(s, i + 1, f - 1);
				return true;
			}
		}
		
		return false;
	}

}
