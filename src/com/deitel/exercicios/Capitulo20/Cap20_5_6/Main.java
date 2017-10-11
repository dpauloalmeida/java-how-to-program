package Cap20_5_6;


public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		

		try {
			printArray(intArray, 2, 5);
		}
		catch(InvalidSubcriptExcepcion e) {
			System.out.println(e.getMessage());
		}
		
		try {
			printArray(doubleArray, 2, 5);
		}
		catch(InvalidSubcriptExcepcion e) {
			System.out.println(e.getMessage());
		}
		
		try {
			printArray(charArray, 2, 5);
		}
		catch(InvalidSubcriptExcepcion e) {
			System.out.println(e.getMessage());
		}
		
		try {
			printArray(stringArray, 0, 8);
		}
		catch(InvalidSubcriptExcepcion e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static <T> void printArray(T[] input, int low, int high) {
		
		if( low < 0 || high > input.length) {
			throw new InvalidSubcriptExcepcion();
		}
		
		for(int index = low; index < high; index++) {
			System.out.printf("%s ", input[index]);
		}
		System.out.println();
	}
	
	private static void printArray(String[] input, int low, int high) {
		for(int index = low; index < high; index++) {
			System.out.printf("%-4s%-4s", index % 4 == 0 ? "\n" : "", input[index]);
		}
		System.out.println();
	}

}
