package com.deitel.exercicios.Capitulo3.Cap3_15;


public class Main
{
	public static void main( String[] args )
	{
		Account account1 = new Account( "Danilo Almeida", 50 );
		Account account2 = new Account( "Diogo Almeida", -7 );

		java.util.Scanner input = new java.util.Scanner( System.in );

		double amount;
		
		displayAccount( account1 );
		displayAccount( account2 );
		
		amount = input.nextDouble();
		
		account2.deposit( amount );
		
		displayAccount( account1 );
		displayAccount( account2 );
		
		amount = input.nextDouble();
		
		account1.deposit( amount );
		
		displayAccount( account1 );
		displayAccount( account2 );

	}

	public static void displayAccount( Account accountToDisplay )
	{
		System.out.printf( "Nome: %s%nSaldo: %.2f%n%n", accountToDisplay.getName(), 
				accountToDisplay.getBalance() );
	}
}
