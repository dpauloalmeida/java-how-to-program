package Cap18_9;


public class Main {

	public static void main(String[] args) {
		System.out.println(power(3, 4));
	}

	private static int power(int b, int e) {
		if(e == 1) {
			return b;
		}
		else {
			return b * power(b, e - 1);
		}
	}
	
}
