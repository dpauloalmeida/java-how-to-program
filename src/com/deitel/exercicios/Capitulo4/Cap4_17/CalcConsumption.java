package Cap4_17;

public class CalcConsumption
{
	private int distanceTraveled;
	private int literConsumed;
	
	public void setDistanceTraveled( int distanceTraveled )
	{
		this.distanceTraveled = distanceTraveled;
	}
	
	public int getDistanceTraveled()
	{
		return distanceTraveled;
	}
	
	public void setLiterConsumed( int literConsumed)
	{
		this.literConsumed = literConsumed;
	}
	
	public int getLiterConsumed()
	{
		return literConsumed;
	}
	
	public double consumed()
	{
		return distanceTraveled / literConsumed;
	}
}
