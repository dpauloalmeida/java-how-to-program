package Cap7_20;

public class Employee
{
	private double[][] sale;
	private int numberSalesman;
	private int numberProduct;
	private double valueProducct;
	
	public Employee( double[][] sale )
	{
		this.sale = sale;
	}
	
	public void setNumberSalesman( int numberSalesman )
	{
		this.numberSalesman = numberSalesman;
	}
	
	public int getNumberSalesman()
	{
		return numberSalesman;
	}
	
	public void setNumberProduct( int numberProduct )
	{
		this.numberProduct = numberProduct;
	}
	
	public int getNumberProduct()
	{
		return numberProduct;
	}
	
	public void setValueProduct( double valueProduct )
	{
		this.valueProducct = valueProduct;
	}
	
	public double getValueProduct()
	{
		return valueProducct;
	}
	
	public void setSale( int numberProduct, int numberSalesman, double valueProduct )
	{
		this.sale[ numberProduct - 1 ][ numberSalesman - 1 ] += valueProduct;
	}
	
	public void processSales()
	{
		for( int i = 0; i < sale.length; i++ )
		{
			double sumSalesToProduct = 0;
			
			System.out.printf( "Product[%d]", i + 1 );

			for( double j : sale[ i ] )
			{
				System.out.printf( "%7.2f", j );
				
				sumSalesToProduct += j;
			}
			
			System.out.printf( "%10.2f%n", sumSalesToProduct );
		}
		
		System.out.printf( "%10s", "Total" );
		
		for( int i = 0; i < sale.length - 1; i++ )
		{
			double sumSalesToSalesman = 0;
			
			for( int j = 0; j < sale.length; j++ )
				sumSalesToSalesman += sale[ j ][ i ];
				
			System.out.printf( "%7.2f", sumSalesToSalesman );
		}
	}
}
