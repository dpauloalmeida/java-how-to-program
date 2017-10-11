package Cap4_19;

public class Comission
{
	private int item;
	private double value;
	
	public Comission( int item, double value )
	{
		this.item = item;
		this.value = value;
	}
	
	public void setItem( int item )
	{
		this.item = item;
	}
	
	public int getItem()
	{
		return item;
	}
	
	public void setValue( double value )
	{
		this.value = value;
	}
	
	public double getValue()
	{
		return value;
	}	
}
