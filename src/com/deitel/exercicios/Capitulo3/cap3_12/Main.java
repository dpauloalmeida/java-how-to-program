package com.deitel.exercicios.Capitulo3.cap3_12;


public class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );
		
		Invoice item1 = new Invoice( "1", "test1", -10, -5 );
		
		System.out.printf( "N�mero: %s%nNome: %s%nQuantidade: %d%nPre�o: %.2f%nValor da fatura: %.2f%n",
				item1.getNumber(), item1.getName(), item1.getAmount(), item1.getPrice(), item1.getInvoiceAmount() );
		
	}
}
