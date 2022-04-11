package Arrays;

import java.util.Scanner;

public class Repeticao02 {
	public static void main(String args[])
	{
		int par = 0, num, i;
		
		for(i=1;i<=10;i++)
		{
			System.out.println("Informe um número ");
			Scanner leitor = new Scanner (System.in);
			num = leitor.nextInt();
			
			if (num % 2 == 0)
			{
				par = par+1;
			}
			
		}System.out.println("Pares: "+par);
		System.out.printf("Ímpares: %d" , 10-par);
		
		
	}

}
