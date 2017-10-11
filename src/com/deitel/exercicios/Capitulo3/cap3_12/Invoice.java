package com.deitel.exercicios.Capitulo3.cap3_12;

public class Invoice
{
	private String number;
	private String name;
	private int amount;
	private double price;
	
	public Invoice( String number, String name, int amount, double price )
	{
		this.number = number;
		
		this.name = name;
		
		if( amount > 0 )
			this.amount = amount;
		
		if( price > 0 )
			this.price = price;
	}
	
	public double getInvoiceAmount()
	{
		return amount * price;
	}
	
	public void setNumber( String number )
	{
		this.number = number;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAmount( int amount )
	{
		this.amount = amount;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public void setPrice( double price )
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
}
