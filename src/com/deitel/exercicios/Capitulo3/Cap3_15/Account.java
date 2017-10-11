package com.deitel.exercicios.Capitulo3.Cap3_15;

public class Account
{
	private String name;
	private double balance;
	
	public Account( String name, double balance)
	{
		this.name = name;
		
		if( balance > 0 )
			this.balance = balance;
	}
	
	public void deposit( double depositAmount )
	{
		if( depositAmount > 0 )
			balance += depositAmount;
	}
	
	public void withdraw( double withdrawAmount )
	{
		if( withdrawAmount > balance )
			System.out.println( "Withdraw amount exeeded account balance!" );
		else
			balance -= withdrawAmount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
