package com.deitel.exercicios.Capitulo18.Cap18_10;


public class Main {

	public static void main(String[] args) {
		System.out.println("= " + factorial(5));
	}
	
	private static long factorial(long number) {
		long temp;
		
		if(number == 1) {
			System.out.println(number + " " + number);
			return 1;
		}
		else {
			temp = factorial(number - 1);
			
			System.out.println(number + " " + temp);
			return number * temp;
		}
	}

}
