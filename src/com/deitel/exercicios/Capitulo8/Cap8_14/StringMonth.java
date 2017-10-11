package Cap8_14;


public enum StringMonth
{
	JANUARY( 1, "Janeiro" ),
	FEBRUARY( 2, "Fevreiro" ),
	MARCH( 3, "Março" ),
	APRIL( 4, "Abril" ),
	MAY( 5, "Maio" ),
	JUNE( 6, "Junho" ),
	JULY( 7, "Julho" ),
	AUGUST( 8, "Agosto" ),
	SEPTEMBER( 9, "Setembro" ),
	OCTOBER( 10, "Outubro" ),
	NOVEMBER( 11, "Novembro" ),
	DECEMBER( 12, "Dezembro" );
	
	private int number;
	private String name;
	
	private StringMonth( int number, String name )
	{
		this.number = number;
		this.name = name;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
}
