package Cap4_19;


public class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		Comission item1 = new Comission( 1, 200 );
		Comission item2 = new Comission( 2, 130 );
		Comission item3 = new Comission( 3, 100 );
		Comission item4 = new Comission( 4, 350 );
		
		int choice;
		double total = 0;
		
		System.out.print( "Sair = -1\nInfome o código do produto vendido? " );
		
		while( ( choice = input.nextInt() ) != 0 )
		{
			switch( choice )
			{
				case 1:
					System.out.printf( "Produto de número: %d Valor: R$ %.2f%n%n",
							item1.getItem(), item1.getValue() );
					total += item1.getValue();
					break;
					
				case 2:
					System.out.printf( "Produto de número: %d Valor: R$ %.2f%n%n",
							item2.getItem(), item2.getValue() );
					total += item2.getValue();
					break;
					
				case 3:
					System.out.printf( "Produto de número: %d Valor: R$ %.2f%n%n",
							item3.getItem(), item3.getValue() );
					total += item3.getValue();
					break;
					
				case 4:
					System.out.printf( "Produto de número: %d Valor: R$ %.2f%n%n",
							item4.getItem(), item4.getValue() );
					total += item4.getValue();
					break;
					
					default:
						System.out.println( "*** Inválido ***" );
			}
			
			System.out.print( "Sair = -1\nInfome o código do produto vendido? " );
		}
		
		System.out.printf( "Valor da venda semanal: R$ %,.2f%nComissão: R$ %,.2f%nTotal: R$ %,.2f%n",
				total, total * 0.09, total * 0.09 + 200 );
		
		System.out.println( "\nEncerrando..." );
	}
}
