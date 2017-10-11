package Cap7_21;

public class Main
{
	private static java.util.Scanner SC = new java.util.Scanner( System.in );
	
	private static int SIZE = 20;
	
	public static void main( String[] args )
	{
		int[][] floor = new int[ SIZE ][ SIZE ];
		GraphicTurtle myTurtle = new GraphicTurtle( floor, 0, 0, 1, 1 );
		
		int choice;
		int turn = 1;
		
		choiceMenu();
		
		while( ( choice = SC.nextInt() ) != 0 )
		{
			switch( choice )
			{
				case 1:
					myTurtle.setPosicionPen( 1 );
					break; // fim case 1
					
				case 2:
					myTurtle.setPosicionPen( 2 );
					break; // fim case 2
					
				case 3:
					++turn;
					
					if( turn > 4 )
						turn = 0;
					
					myTurtle.setPosicionTurn( turn );
					break; // fim case 3
					
				case 4:
					--turn;
					
					if( turn < 0 )
						turn = 4;
					
					myTurtle.setPosicionTurn( turn );
					break; // fim case 4
					
				case 5:
					myTurtle.processTurtle( SC.nextInt() );
					break; // fim case 5
					
				case 6:
					System.out.println( "============== Print Array ==============" );
					myTurtle.displayArray();
					break; // fim case 6
					
				default: 
					System.out.println( "*** Inválido ***" );
			}
		}
	}

	public static void choiceMenu()
	{
		System.out.println( "========================================" );
		System.out.println( "================ Choose ================" );
		System.out.println( "========================================" );
		
		System.out.printf( "1 - Caneta para cima%n" +
						   "2 - Caneta para baixo%n" +
						   "3 - Vira para direita%n" +
						   "4 - Vira para esquerda%n" +
						   "5 - Avançe X espaços%n" +
						   "6 - Exiba o array%n" +
						   "0 - Sair%n%n" );
	}
	
}
