package com.deitel.exercicios.Capitulo11.Cap11_16;

public class Main {

	public static void main(String[] args) {
		System.out.println();

		ExceptionTest test;

		try {
			test = new ExceptionTest(" ", 6);

			System.out.println(test);
		}
		catch (ExceptionA e) {
			System.out.println(e.getMessage());
		}


	}

}
