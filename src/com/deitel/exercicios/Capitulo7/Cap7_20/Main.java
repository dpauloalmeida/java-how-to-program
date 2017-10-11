package Cap7_20;


public class Main
{
	public static java.util.Scanner	SC = new java.util.Scanner( System.in );
	
	public static int SALESMAN_LENGTH = 4;
	public static int PRODUCT_LENGTH = 5;
	
	public static void main( String[] args )
	{
		double[][] sales = new double[ PRODUCT_LENGTH ][ SALESMAN_LENGTH ];
		
		Employee myEmployee = new Employee( sales );
		
		int choice;
		
		
		while( ( choice = displayMenu() ) != 0 )
		{
			if( choice == 1 )
			{
				System.out.print( "Enter to number salesman: " );
				myEmployee.setNumberSalesman( SC.nextInt() );
				
				System.out.print( "Enter to number product: " );
				myEmployee.setNumberProduct( SC.nextInt() );
				
				System.out.print( "Enter to total value in day: " );
				myEmployee.setValueProduct( SC.nextDouble() );
				
				System.out.println(); // new line
				
				myEmployee.setSale( myEmployee.getNumberProduct(),
						myEmployee.getNumberSalesman(), myEmployee.getValueProduct() );
			}
			else
				System.out.println( "*** Invalid ***" );
		}
		
		System.out.printf( "Sales         [1]    [2]    [3]    [4]     Total%n" );
		myEmployee.processSales();
		
		System.out.println();
		System.out.println( "Closing..." );
	}
	
	public static int displayMenu()
	{
		System.out.println( "=====================================" );
		System.out.println( "========== Front of Cashier ==========" );
		System.out.println( "=====================================" );
		
		System.out.printf( "1 - Sale%n0 - Exit%n? " );
		int displayChoice = SC.nextInt();

		return displayChoice;
	}

}
