package Arrays;

import java.util.Scanner;

public class DoWhile {
public static void main(String args[])
{
	int numero, soma = 0;
	
	do {
		System.out.println("Digite um número do teclado: ");
		Scanner leia = new Scanner(System.in);
		numero = leia.nextInt();
		
		soma = soma + numero;
	}
	
	while(numero != 0);
	
	System.out.println("A soma dos números digitados é: " + soma);
	
}
}
