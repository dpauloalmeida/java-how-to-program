package Cap20_7;


public class Main {

	public static void main(String[] args) {
		
		System.out.println(isEqualTo(3, 2));

	}

	private static <T> boolean isEqualTo(T a, T b) {
		return a.equals(b);
	}
	
}
