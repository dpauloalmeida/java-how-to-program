package Cap8_8;

public class Date
{
	private int month; // 1-12
	private int day; // 1-31 conforme mês
	private int year; // qualquer ano
	
	private static final int[] daysPerMonth = 
							{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// contrutor
	public Date( int month, int day, int year )
	{
		if( month <= 0 || month > 12 )
			throw new IllegalArgumentException( "month (" + month + ") must be 1-12" );
		
		if( day <= 0 || ( day > daysPerMonth[ month ] && !( month == 2 && day == 29) ) )
			throw new IllegalArgumentException( "day (" + day + ") out-of-range specified" );
		
		if( month == 2 && day == 29 && !( year % 400 == 0 || 
				( year % 4 == 0 && year % 100 != 0) ) )
			throw new IllegalArgumentException( "day (" + day + ") out-of-range specified" );
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf( "Date object contructor for date %s%n", this );
	}
	
	public void nextDay( int next )
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
	
	public String toString()
	{
		return String.format( "%02d/%02d/%d", day, month, year );
	}
}
