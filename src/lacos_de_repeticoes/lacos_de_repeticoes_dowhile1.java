package lacos_de_repeticoes;

import java.util.Scanner;

public class lacos_de_repeticoes_dowhile1 {

	public static void main(String[] args) {

		// Cria uma instância para a entrada do usuário
		Scanner leia = new Scanner(System.in);

		// Declarando variaveis
		int numero, somaNumero = 0;

		// Laço de Repetição

		do {

			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			somaNumero += numero;

		} while (numero > 0);

		System.out.printf("A soma dos números positivos é: %d", somaNumero);

	}

}
