package com.deitel.exercicios.Capitulo3.Cap3_14;

public class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public void setDay( int day )
	{
		this.day = day;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setMonth( int month )
	{
		this.month = month;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setYear( int year )
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void displayDate()
	{
		System.out.printf( "%d / %d / %d", getDay(), getMonth(), getYear() );
	}
}
