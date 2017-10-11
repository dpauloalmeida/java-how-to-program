package com.deitel.exercicios.Capitulo3.cap3_13;

public class Employee
{
	private String fistName;
	private String lastName;
	private double salary;
	
	public Employee( String fistName, String lastName, double salary )
	{
		this.fistName = fistName;
		this.lastName = lastName;
		
		if( salary > 0 )
			this.salary = salary;
	}
	
	public void setFistName( String fistName )
	{
		this.fistName = fistName;
	}
	
	public String getFistName()
	{
		return fistName;
	}
	
	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setSalary( double salary )
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
