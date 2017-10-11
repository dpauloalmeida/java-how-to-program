package com.deitel.exercicios.Capitulo11.Cap11_16;

public class ExceptionTest {
	private String s;
	private int i;

	public ExceptionTest(String s, int i) throws ExceptionA {
		setS(s);
		setI(i);
	}

	public void setS(String s) throws ExceptionA {
		if (s.matches(" ")) {
			throw new ExceptionB();
		}
		this.s = s;
	}

	public void setI(int i) throws ExceptionA {
		if(i > 5){
			throw new ExceptionC();
		}
		this.i = i;
	}

	@Override
	public String toString() {
		return "ExceptionTest{" +
				"s = '" + s + '\'' +
				", i = " + i +
				'}';
	}
}
