package Cap8_12;

public class DateAndTime
{
	// variaveis date
	private int month; // 1-12
	private int day; // 1-31 conforme mês
	private int year; // qualquer ano
	private static final int[] daysPerMonth = 
		{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// variaveis time
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	public DateAndTime( int day, int month, int year, int hour, int minute, int second )
	{
		// condições de date
		if( month <= 0 || month > 12 )
			throw new IllegalArgumentException( "month (" + month + ") must be 1-12" );
		
		if( day <= 0 || ( day > daysPerMonth[ month ] && !( month == 2 && day == 29) ) )
			throw new IllegalArgumentException( "day (" + day + ") out-of-range specified" );
		
		if( month == 2 && day == 29 && !( year % 400 == 0 || 
				( year % 4 == 0 && year % 100 != 0) ) )
			throw new IllegalArgumentException( "day (" + day + ") out-of-range specified" );
		
		// codições de time
		if( hour < 0 || hour >=24 )
			throw new IllegalArgumentException( "hour (" + hour + ") out-of-range specifield" );
		
		if( minute < 0 || minute > 59 )
			throw new IllegalArgumentException( "minute (" + minute + ") out-of-range specifield" );
		
		if( second < 0 || second > 59 )
			throw new IllegalArgumentException( "second (" + second + ") out-of-range specifield" );
		
		// atribuição date
		this.month = month;
		this.day = day;
		this.year = year;
		
		// atrivuição time
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// métodos date
	public void nextDay()
	{
		
		if( month == 2 && day == 28 && ( year % 400 == 0 || 
				( year % 4 == 0 && year % 100 != 0) ) )
			++day;
		else if( day >= daysPerMonth[ month ] || ( month == 2 && day == 29 ) )
		{
			day = 1;
			
			nextMonth();
		}
		else 
			++day;	
	}
	
	public void nextMonth()
	{
		if( month >= 12 )
		{
			month = 1;
			
			nextYear();
		}
		else
			++month;
	}
	
	public void nextYear()
	{
		++year;
	}
	
	// metodos time
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
		{
			setHour( 0 );
			
			nextDay();
		}
		else
			setHour( getHour() + 1 );
	}
	
	public String toDate()
	{
		return String.format( "%02d/%02d/%d", day, month, year );
	}
	
	public String toString()
	{
		return String.format( "%d:%02d:%02d %s", 
				( ( getHour() == 0 || getHour() == 12 ) ? 12 : getHour() % 12 ),
				getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM ") );
	}
}
