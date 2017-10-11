package Cap8_10;

public class Main
{

	public static void main( String[] args )
	{
		
		System.out.printf( "%s%10s%n", "Estado", "Duração" );
		for( TrafficLight trafficLight : TrafficLight.values() )
			System.out.printf( "%6s%5d %s%n", trafficLight, trafficLight.getTime() + 1, "min" );
	}

}
