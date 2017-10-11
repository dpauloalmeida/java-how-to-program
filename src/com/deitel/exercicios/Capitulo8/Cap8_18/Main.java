package com.deitel.exercicios.Capitulo8.Cap8_18;


import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main
{

	public static void main( String[] args )
	{
		java.util.Scanner sc = new java.util.Scanner( System.in );
		Account myAccount = new Account( "Danilo", 50.00 );
		BigDecimal myBigDecimal = BigDecimal.valueOf( myAccount.getBalance() );
		
		System.out.printf( "Nome: %s%nSaldo: %s%n%n", myAccount.getName(),
				NumberFormat.getCurrencyInstance().format( myBigDecimal ) );
		
		System.out.print( "Informe o valor do deposito: " );
		myAccount.deposit( sc.nextDouble() );
		
		myBigDecimal = BigDecimal.valueOf( myAccount.getBalance() );
		
		System.out.println();
		
		System.out.printf( "Nome: %s%nSaldo: %s%n%n", myAccount.getName(),
				NumberFormat.getCurrencyInstance().format( myBigDecimal ) );
		
		System.out.println( "Encerrando..." );
	}

}
