package vetores_e_matrizes;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {

		// Cria uma instancia para ler a entraada do usuario
		Scanner leia = new Scanner(System.in);

		// Cria um array int com 10 elementos
		int[] numeros = new int[10];

		// Declara as variaveis
		int soma = 0;
		int indice;
		float media = 0;

		// Cria um laço de repetição para que o usuario insira o valor para cada elemento
		for (indice = 0; indice < numeros.length; indice++) {
			System.out.println("\nInsira o " + (indice + 1) + "° valor");
			numeros[indice] = leia.nextInt();
			
			soma += numeros[indice]; // soma todos os valores inserios
		}

		// Imprime na tela do usuário os elementos ímpares
		System.out.println("\nElementos nos índices ímpares:");
		
		// Cria um laço condicional dentro de um de repetição mostrando apenas os números ímpares
		for (indice = 0; indice < numeros.length; indice++) {
			if (numeros[indice] % 2 != 0) {
				System.out.printf("%d ", numeros[indice]);
			}

		}

		// Imprime na tela do usuário os elementos pares
		System.out.println("\nElementos nos índices pares:");

		// Cria um laço condicional dentro de um de repetição mostrando apenas os números pares
		for (indice = 0; indice < numeros.length; indice++) {
			if (numeros[indice] % 2 == 0) {
				System.out.printf("%d ", numeros[indice]);
			}

		}
			// Imprime a soma dos elementos
			System.out.println("\nSoma: "+soma);
			
			// Faz a média da soma dos elementos e imprime em seguida
			media = soma / 10;
			System.out.printf("\nMedia: %.2f ", media);
	}

}
