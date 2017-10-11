package Cap18_7;


public class Main {

	public static void main(String[] args) {
		
		System.out.println(mystery(2, 4));
	}
	
	private static int mystery(int a, int b) {
		if(b == 1) {
			return a;
		}
		else {
			return a + mystery(a, b - 1);
		}	
	}

}
