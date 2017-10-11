package Cap6_10;

public class RoundedNumbers
{
	private double number;
	
	public void setNumber( double number )
	{
		this.number = number;
	}
	
	public double getNumber()
	{
		return number;
	}
	
	public double roundToTenths()
	{
		return Math.floor( number * 10 + 0.5 ) / 10;
	}
	
	public double roundToHundreths()
	{
		return Math.floor( number * 100 + 0.5 ) / 100;
	}
	
	public double roundToThousandths()
	{
		return Math.floor( number * 1000 + 0.5 ) / 1000;
	}
}
