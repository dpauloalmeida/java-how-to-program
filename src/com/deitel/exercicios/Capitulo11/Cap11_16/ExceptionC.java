package com.deitel.exercicios.Capitulo11.Cap11_16;

public class ExceptionC extends ExceptionB
{
	public ExceptionC() {
		this("ExcepcionC");
	}

	public ExceptionC (String msg )
	{
		super( msg );
	}
}
