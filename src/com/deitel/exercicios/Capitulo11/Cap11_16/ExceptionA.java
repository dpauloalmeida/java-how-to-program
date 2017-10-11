package com.deitel.exercicios.Capitulo11.Cap11_16;

public class ExceptionA extends Exception
{
	public ExceptionA() {
		this("ExcepcionA");
	}

	public ExceptionA (String msg )
	{
		super( msg );
	}
}
