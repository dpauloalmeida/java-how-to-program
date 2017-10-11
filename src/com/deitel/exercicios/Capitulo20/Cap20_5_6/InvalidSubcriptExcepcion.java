package Cap20_5_6;


public class InvalidSubcriptExcepcion extends RuntimeException {
	
	public InvalidSubcriptExcepcion() {
		this("Index out-of-range.");
	}
	
	public InvalidSubcriptExcepcion(String msg) {
		super(msg);
	}

}
