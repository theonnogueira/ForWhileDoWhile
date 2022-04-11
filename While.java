package Arrays;

import java.util.Scanner;

public class While {
	public static void main(String args[]) {
		int idade, contador21 = 0, contador50 = 0;
		System.out.println("Digite a sua idade: ");
		Scanner ler = new Scanner(System.in);
		idade = ler.nextInt();
		while (idade != -99) {
			if (idade < 21)
				contador21++;
			if (idade > 50)
				contador50++;
			System.out.println("\n Digite a idade(Para encerrar digite -99): ");
			idade = ler.nextInt();

		}
		System.out.println("\nO total de pessoas com menos de 21 anos é : " + contador21);
		System.out.println("\nO total de pessoas com mais de 50 anos é : " + contador50);

	}

}
