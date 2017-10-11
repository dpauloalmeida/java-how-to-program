package Cap9_3;

public class BaseCommissionEmployee
{
	private ComissionEmployee dateEmployee;
	private double baseSalary;
	
	
	public BaseCommissionEmployee( double baseSalary, 
			ComissionEmployee dateEmployee )
	{
		if( baseSalary < 0 )
			throw new IllegalArgumentException(
					"Salary base out-of-range" );
		
		this.baseSalary = baseSalary;
		this.dateEmployee = dateEmployee;
	}
	
	public void setBaseSalary( double baseSalary )
	{
		if( baseSalary < 0 )
			throw new IllegalArgumentException(
					"Salary base out-of-range" );
		
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public String toString()
	{
		return String.format( "%s%n%s: %.2f", dateEmployee,
				"Salary base: ", getBaseSalary() );
	}
	
}
