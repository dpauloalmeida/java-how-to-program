package Cap7_10;

public class ComissionSales
{
	private double value;
	private int[] counts;
	
	public ComissionSales( int[] counts )
	{
		this.counts = counts;
	}
	
	public void setValue( double value )
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return (int)value;
	}
	
	public void frequencyComission()
	{
		double comission = ( getValue() * 0.09 ) + 200;
		
		++counts[ (int)comission / 100 ];
	}
}
