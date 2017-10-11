package Cap8_8;

public class Employee
{
	private String name;
	private Date birthDate;
	private Date hiredate;
	
	public Employee( String name, Date birthDate, Date hireDate )
	{
		this.name = name;
		this.birthDate = birthDate;
		this.hiredate = hireDate;
	}
	
	public String toString()
	{
		return String.format( "%s  Hire: %s  Birthday: %s", name, hiredate, birthDate );
	}
}
