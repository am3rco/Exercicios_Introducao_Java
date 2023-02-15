package vetores_e_matrizes;

import java.util.Scanner;

public class vetor1 {

	public static void main(String[] args) {

		// Cria um arry inteiro com 10 elementos com um valor cada
		int[] numeroPosição = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		// Declara as variaveis
		int numero;
		boolean encontrado = false;

		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);

		System.out.println("\nInsira um numero: ");
		numero = leia.nextInt();

		for (int indice = 0; indice < numeroPosição.length; indice++) {

			if (numeroPosição[indice] == numero) {
				System.out.println("\nO número " + numero + " se encontra na posição: " +indice);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}

}
