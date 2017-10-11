package Cap8_5;

public class Time
{
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	public Time()
	{
		this( 0, 0, 0 );
	}
	
	public Time( int hour )
	{
		this( hour, 0, 0 );
	}
	
	public Time( int hour, int minute )
	{
		this( hour, minute, 0 );
	}
	
	public Time( int hour, int minute, int second )
	{
		if( hour < 0 || hour >=24 )
			throw new IllegalArgumentException( "hour (" + hour + ") out-of-range specifield" );
		
		if( minute < 0 || minute > 59 )
			throw new IllegalArgumentException( "minute (" + minute + ") out-of-range specifield" );
		
		if( second < 0 || second > 59 )
			throw new IllegalArgumentException( "second (" + second + ") out-of-range specifield" );
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time( Time times )
	{
		this( times.getHour(), times.getMinute(), times.getSecond() );
	}
	
	// metodos sets
	public void setTime( int hour, int minute, int second )
	{
		if( hour < 0 || hour >= 24 )
			throw new IllegalArgumentException( "hour (" + hour + ") out-of-range specifield" );
		
		if( minute < 0 || minute > 59 )
			throw new IllegalArgumentException( "minute (" + minute + ") out-of-range specifield" );
		
		if( second < 0 || second > 59 )
			throw new IllegalArgumentException( "second (" + second + ") out-of-range specifield" );
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour( int hour )
	{
		if( hour < 0 || hour >= 24 )
			throw new IllegalArgumentException( "hour (" + hour + ") out-of-range specifield" );
		
		this.hour = hour;
	}
	
	public void setMinute( int minute )
	{
		if( minute < 0 || minute > 59 )
			throw new IllegalArgumentException( "minute (" + minute + ") out-of-range specifield" );
		
		this.minute = minute;
	}
	
	public void setSecond( int second )
	{
		if( second < 0 || second > 59 )
			throw new IllegalArgumentException( "second (" + second + ") out-of-range specifield" );
		
		this.second = second;
	}
	
	// metodos gets
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}

	public void tick()
	{
		if( getSecond() >= 59 )
		{
			setSecond( 0 );
			
			incrementMinute();
		}
		else
			setSecond( getSecond() + 1 );

	}
	
	public void incrementMinute()
	{
		if( getMinute() >= 59 )
		{
			setMinute( 0 );
			
			incrementHour();
		}
		else
			setMinute( getMinute() + 1 ); 
	}
	
	public void incrementHour()
	{
		if( getHour() >= 23 )
			setHour( 0 );
		else
			setHour( getHour() + 1 );
	}
	
	public String toString()
	{
		tick();
		
		return String.format( "%d:%02d:%02d %s", 
				( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
				getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM ") );
	}
	
}
