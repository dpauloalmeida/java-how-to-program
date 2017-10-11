package Cap18_13;


public class Main {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(someMethod(array, 5));
	}
	
	private static String someMethod(int[] array, int x) {
		if(x < array.length) {
			return String.format("%s%d ", someMethod(array, x + 1), array[x]);
		}
		else {
			return "";
		}
	}

}
