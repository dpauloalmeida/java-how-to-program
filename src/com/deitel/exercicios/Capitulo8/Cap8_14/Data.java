package Cap8_14;


public class Data
{
	StringMonth myStringMonth;
	
	private int month; // 1-12
	private int day; // 1-31 conforme mês
	private int year; // qualquer ano
	private String nameMonth;
	
	private static final int[] daysPerMonth = 
							{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// contrutor
	public Data( int day, int month, int year )
	{
		if( month <= 0 || month > 12 )
			throw new IllegalArgumentException( "month (" + month + ") must be 1-12" );
		
		if( day <= 0 || ( day > daysPerMonth[ month ] && !( month == 2 && day == 29) ) )
			throw new IllegalArgumentException( "day (" + day + ") out-of-range specified" );
		
		if( month == 2 && day == 29 && !( year % 400 == 0 || 
				( year % 4 == 0 && year % 100 != 0) ) )
			throw new IllegalArgumentException( "day (" + day + ") out-of-range specified" );
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void savingStringMonth()
	{

		for( StringMonth stringMonth : StringMonth.values() )
		{
			if( month == stringMonth.getNumber() )
				nameMonth = stringMonth.getName();
		}
	}
	
	public String toString()
	{
		savingStringMonth();
		
		return String.format( "%02d/%02d/%d%n%d %s %d%n%d %d%n", day, month, year, 
				day, nameMonth, year, day, year );
	}
	
}
