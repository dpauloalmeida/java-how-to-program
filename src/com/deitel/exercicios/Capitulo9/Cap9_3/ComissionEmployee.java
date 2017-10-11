package Cap9_3;

public class ComissionEmployee
{
	private final String fistName;
	private final String lastName;
	private final String socialNumber;
	private double grossSales;
	private double commissionRate;
	
	// constructor
	public ComissionEmployee( String fistName, String lastName,
			String socialNumber, double grossSales, double commissionRate )
	{
		if( grossSales < 0 )
			throw new IllegalArgumentException(
					"Gross sales out-of-range" );
		
		if( commissionRate < 0 || commissionRate >= 1 )
			throw new IllegalArgumentException(
					"Commission out-of-range" );
		
		this.fistName = fistName;
		this.lastName = lastName;
		this.socialNumber = socialNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public ComissionEmployee()
	{
		this( "", "", "", 0, 0 );
	}
	
	public String getFistName()
	{
		return fistName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getSocialNumber()
	{
		return socialNumber;
	}
	
	public void setGrossSales( double grossSales )
	{
		if( grossSales < 0 )
			throw new IllegalArgumentException(
					"Gross sales out-of-range" );
		
		this.grossSales = grossSales;
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public void setCommissionRate( double commissionRate )
	{
		if( commissionRate <= 0 || commissionRate >= 1 )
			throw new IllegalArgumentException(
					"Commission out-of-range" );
		
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	public double earning()
	{
		return  getGrossSales() * getCommissionRate();
	}
	
	@Override
	public String toString()
	{
		return String.format( "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
				"Commission employee: ", getFistName(), getLastName(),
				"Social number: ", getSocialNumber(),
				"Gross sales: ", getGrossSales(),
				"Commission rate: ", getCommissionRate() );
	}

}
