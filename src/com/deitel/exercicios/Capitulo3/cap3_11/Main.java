package com.deitel.exercicios.Capitulo3.cap3_11;


public class Main
{
	public static void main( String[] args )
	{
		Account myAccount = new Account( "Danilo Almeida", 5000 );

		printHead myPrintHead = new printHead();

		java.util.Scanner input = new java.util.Scanner( System.in );

		int choice;
		double depositAmount;
		double withdrawAmount;

		while ( ( choice = myPrintHead.choice() ) != 0 )
		{
			switch ( choice )
			{
				case 1:
					System.out.printf( "Nome: %s%nSaldo: %.2f%n", myAccount.getName(), myAccount.getBalance() );
					System.out.println(  );
					break;
					
				case 2:
					System.out.print( "Valor do deposito: " );
					depositAmount = input.nextDouble();

					System.out.printf( "%nValor depositado: %.2f%n", depositAmount );
					myAccount.deposit( depositAmount );
					break;
							
				case 3:
					System.out.print( "Valor do saque: " );
					withdrawAmount = input.nextDouble();

					myAccount.withdraw( withdrawAmount );
					break;
					
				default:
					System.out.println( "*** Inválido ***" );
			}
		}
		
		System.out.println( "Encerrando ..." );
	}
}