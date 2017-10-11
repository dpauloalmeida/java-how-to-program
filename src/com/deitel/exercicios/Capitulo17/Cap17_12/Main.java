package Cap17_12;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter to text: ");
		String text = sc.nextLine();
		
		String[] tokens = text.split(" ");
		
		Arrays.stream(tokens)
			  .map(String::toLowerCase)
			  .sorted(String.CASE_INSENSITIVE_ORDER)
			  .distinct()
			  .forEach(System.out::println);
	}

}
