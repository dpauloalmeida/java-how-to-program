package com.deitel.exercicios.Capitulo8.Cap8_18;

public class Account
{
	private String name;
	private double balance;
	
	// constructs
	public Account()
	{
		this( "", 0 );
	}
	
	public Account( String name, double balance)
	{
		if( balance < 0 )
			throw new IllegalArgumentException( "balance (" + balance + ") out-of-range" );
		
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit( double depositAmount )
	{
		if( depositAmount < 0 )
			throw new IllegalArgumentException( "balance (" + depositAmount + ") out-of-range" );
		
		balance += depositAmount;
	}

	public void setName( String name )
	{
		this.name = name;
	}
	
	public void setBalance( double balance )
	{
		this.balance = balance;
	}

	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
