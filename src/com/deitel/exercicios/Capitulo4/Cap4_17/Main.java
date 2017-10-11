package Cap4_17;


public class Main
{
	public static void main( String[] args )
	{
		java.util.Scanner input = new java.util.Scanner( System.in );

		CalcConsumption myCalcConsumption = new CalcConsumption();
		
		int distance;
		int liter;
		int count = 1, totalDistance = 0, totalLiter = 0;
		
		System.out.print( "Informe a quilometragem (-1 = Sair): " );
		distance = input.nextInt();
		
		while( distance != -1 )
		{
			myCalcConsumption.setDistanceTraveled( distance );
			
			System.out.print( "Informe os litros: " );
			liter = input.nextInt();
			
			myCalcConsumption.setLiterConsumed( liter );
			
			System.out.printf( "%nConsumo: %.2f km/litro%n%n", myCalcConsumption.consumed() );
			
			totalDistance += distance;
			totalLiter += liter;
			
			++count;
			
			System.out.print( "Informe a quilometragem (-1 = Sair): " );
			distance = input.nextInt();
		}
		
		System.out.printf( "%n%nQuilometragem total: %d%nLitros total: %d%n",
				totalDistance, totalLiter );
		
		System.out.printf( "%nEncerrando..." );
	}
}
