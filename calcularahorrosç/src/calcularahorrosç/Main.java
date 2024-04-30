package calcularahorrosç;

import java.util.Scanner;

public class Main 
{

	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) 
	{
		int años = 0;
		double porcentaje = 0;
		double ahorroAnual = 0;
		System.out.println("Cuanto vas a ahorrar al año");
		ahorroAnual = sc.nextDouble();
		System.out.println("Que porcentaje de beneficios tendrás al año?");
		porcentaje = sc.nextDouble();
		double ganancias = 0;
		
		
		for(años = 30; años <= 65; años++)
		{
			ganancias += (ahorroAnual + (ganancias / 100 * porcentaje));
			System.out.println("con " + años + " tendras " + ganancias);
		}
	}
}