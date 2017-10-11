package com.deitel.exercicios.Capitulo3.cap3_11;

public class printHead
{
	java.util.Scanner input = new java.util.Scanner(System.in);
	
	int choice;
	
	public int choice()
	{
		System.out.println( "=========================================" );
		System.out.println( "================= Caixa =================" );
		System.out.println( "=========================================" );
		
		System.out.printf( "1 - Saldo%n2 - Deposito%n3 - Saque%n0 - Sair%n? " );
		
		choice = input.nextInt();
		
		return choice;
	}
}