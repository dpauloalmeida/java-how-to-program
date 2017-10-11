package Cap18_17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter to text: ");
		String text = sc.nextLine();
		
		System.out.println(stringReverse(text, 0));

	}
	
	private static String stringReverse(String s, int size) {
		if(size < s.length()) {
			return String.format("%s%c", 
					stringReverse(s, size + 1), s.charAt(size));
		}
		else {
			return "";
		}
	}

}
