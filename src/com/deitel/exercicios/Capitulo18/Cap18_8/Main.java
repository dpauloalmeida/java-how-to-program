package Cap18_8;


public class Main {

	public static void main(String[] args) {
		System.out.println(sum(5));
	}

	private static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return n + sum(n - 1);
		}
	}
	
}
