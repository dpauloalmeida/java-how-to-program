package com.deitel.exercicios.Capitulo11.Cap11_16;

public class ExceptionB extends ExceptionA
{
	public ExceptionB() {
		this("ExcepcionB");
	}

	public ExceptionB (String msg )
	{
		super( msg );
	}

}
