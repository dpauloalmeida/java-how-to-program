package Cap18_12;


public class Main {

	public static void main(String[] args) {
		int[] array = {1, 2, 3};

		System.out.println(mystery(array, 3));
	}

	private static int mystery(int[] array, int size) {
		if(size == 1) {
			return array[0];
		}
		else {
			return array[size - 1] + mystery(array, size - 1);
		}
	}
	
}
