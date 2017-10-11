package Cap17_14;

import java.util.stream.IntStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		System.out.printf("Sum of squares via reduce method: %d%n", 
				IntStream.of(values)
						 .map(value -> value * value)
						 .reduce(0, (x, y) -> x + y));
	}

}
