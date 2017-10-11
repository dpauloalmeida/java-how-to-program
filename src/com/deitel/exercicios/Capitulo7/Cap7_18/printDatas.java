package Cap7_18;

public class printDatas
{
	private int[] wonCountDial;
	private int[] lostCountDial;
	
	public printDatas( int[] wonCountDial, int[] lostCountDial )
	{
		this.wonCountDial = wonCountDial;
		this.lostCountDial = lostCountDial;
	}
	
	public void displayPrint()
	{
		// imprime jogos ganhos, perdidos e suas rolagens de dandos
		for( int i = 1; i < wonCountDial.length; i++ )
		{
			System.out.printf( "%03d%10d", i, wonCountDial[ i ] );
			
			System.out.printf( "%10d%n", lostCountDial[ i ] );
		}
		
		// imprime as chaves de vitorias
		System.out.printf( "%nChances de vitoria: %.2f%n", sumWon() );
		
		// imprime a duração média  de um jogo
		System.out.printf( "%nDuração média do jogo: %.2f%n", durningAverage() );
	}
	
	public double sumWon()
	{
		int sumWon = 0;
		
		for( int x : wonCountDial )
			sumWon += x;
		
		return (double)sumWon * 100 / 1000000;
	}
	
	public double durningAverage()
	{
		int sumAverage = 0;
		
		for( int i = 1; i < wonCountDial.length; i++ )
			sumAverage += i * wonCountDial[ i ];
		
		for( int i = 1; i < lostCountDial.length; i++ )
			sumAverage += i * lostCountDial[ i ];
		
		return (double)sumAverage / 1000000;
	}
	
}
