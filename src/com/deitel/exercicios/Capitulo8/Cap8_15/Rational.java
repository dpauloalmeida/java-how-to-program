package Cap8_15;

public class Rational
{
	private int numerador;
	private int denominador;
	
	private int numberMdc;
	
	// construtor
	public Rational()
	{
		this( 0, 0 );
	}
	
	public Rational( int numerador, int denominador )
	{
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int getNumberMdc()
	{
		return numberMdc;
	}
	
	public void mdc()
	{
		for( int i = denominador; i > 1; i-- )
		{
			if( numerador % i == 0 && denominador % i == 0 )
				numberMdc = i;		
		}
		
		if( numberMdc == 0 )
			numberMdc = 1;
		
		numerador /= numberMdc;
		denominador /= numberMdc;
	}
	
	public String toString()
	{
		return String.format( "Fração reduzida: %d/%d", numerador, denominador );
	}
	
}
