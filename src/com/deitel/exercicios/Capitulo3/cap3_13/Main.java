package com.deitel.exercicios.Capitulo3.cap3_13;


public class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );

		Employee employee1 = new Employee( "Danilo", "Almeida", -50 );
		Employee employee2 = new Employee( "Diogo", "Almeida", 1500 );
		
		
		
		System.out.printf( "Nome: %s %s%nSal�rio: %.2f%n%n",
				employee1.getFistName(), employee1.getLastName(), employee1.getSalary() );
		
		System.out.printf( "Nome: %s %s%nSal�rio: %.2f%n%n",
				employee2.getFistName(), employee2.getLastName(), employee2.getSalary() );
		
		System.out.printf( "Nome: %s %s%nSal�rio: %.2f%n%n",
				employee1.getFistName(), employee1.getLastName(), employee1.getSalary() * 1.10 );
		
		System.out.printf( "Nome: %s %s%nSal�rio: %.2f%n%n",
				employee2.getFistName(), employee2.getLastName(), employee2.getSalary() * 1.10 );
		
		employee1.setSalary( input.nextDouble() );
		
		System.out.printf( "Nome: %s %s%nSal�rio: %.2f%n%n",
				employee1.getFistName(), employee1.getLastName(), employee1.getSalary() * 1.10 );
		
		System.out.printf( "Nome: %s %s%nSal�rio: %.2f%n%n",
				employee2.getFistName(), employee2.getLastName(), employee2.getSalary() * 1.10 );
	}
}
