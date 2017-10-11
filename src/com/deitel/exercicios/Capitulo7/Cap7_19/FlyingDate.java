package Cap7_19;


public class FlyingDate
{
	public boolean[] armchair;
	
	// construtor
	public FlyingDate( boolean[] armchair )
	{
		this.armchair = armchair;
	}
	
	public void setArmchair( int armchair )
	{
		if( this.armchair[ armchair ] == false )
			this.armchair[ armchair ] = true;
		else
		{
			if( armchair <= 5 )
			{
				int count = 0;
				
				System.out.print( "Poltronas vagas na Primeira Classe: " );
				for( int i = 1; i <= 5; i ++ )
				{
					if( this.armchair[ i ] == false )
					{
						System.out.printf( "%2d", i );
						++count;
					}
					
					if( count == 0 && i == 5 )
						System.out.print( "Sem vagas" );
				}
				
				System.out.printf( "%n%n" );
			}
			else
			{
				if( armchair >= 6 )
				{
					int count = 0;
					
					for( int i = 6; i <= 10; i ++ )
					{
						System.out.print( "Poltronas vagas na Econômica: " );
						if( this.armchair[ i ] == false )
						{
							System.out.printf( "%2d", i );
							++count;
						}
						
						if( count == 0 && i == 5 )
							System.out.println( "Sem vagas" );
					}
					
					System.out.printf( "%n%n" );
				}
			}
		}
	}
	
	public boolean getArmchair( int armchair )
	{
		return this.armchair[ armchair ];
	}
	
	public void printTicketFlying( int armchair )
	{
		if( armchair <= 5 )
			System.out.printf( "Primeira Classe%nPoltrona: %d%n%n", armchair );
		else
			System.out.printf( "Classe Economica%nPoltrona: %d%n%n", armchair );
	}
}
