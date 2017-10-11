package Cap7_19;

public class Main
{

	public static java.util.Scanner scan = new java.util.Scanner( System.in );
	
	public static void main( String[] args )
	{	
		boolean[] armchair = new boolean[ 11 ];
		
		FlyingDate myFlying = new FlyingDate( armchair );
		
		int choice;

		
		while( ( choice = choice() ) != 0 )
		{
			if( choice == 1 )
			{
				System.out.print( "Escolha uma poltrona de 1 à 5: " );
				int armchairChoice = scan.nextInt();
				
				myFlying.setArmchair( armchairChoice );
			}
		}

	}
	
	public static int choice()
	{
		System.out.println( "===========================================\n" +
						    "================== Caixa ==================\n" +
						    "===========================================\n" );
		
		System.out.printf( "1 - Primeira Classe%n2 - Econômica%n0 - Sair%n? " );
		int choice = scan.nextInt();
		
		return choice;	
	}

}
