package Cap18_11;


public class Main {

	public static void main(String[] args) {
		System.out.println(Mdc(15, 50));
	}
	
	private static int Mdc(int x, int y) {
		if(y == 0) {
			return x;
		}
		else {
			System.out.println(y);
			return Mdc(y, x % y);
		}
	}
	
}
