package Cap8_10;

public enum TrafficLight
{
	RED( 3 ),
	GREEN( 6 ),
	YELLOW( 1 );
	
	private int time;
	
	private TrafficLight( int time )
	{
		this.time = time;
	}
	
	public int getTime()
	{
		return time;
	}
}
