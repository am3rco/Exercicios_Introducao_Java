package vetores_e_matrizes;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {

		// Cria uma matriz de inteiros com 3 linhas e 3 colunas
		int[][] valor = new int[3][3];

		// Declara as variáveis
		int linha, coluna, somaValorDiagonalPrincipal = 0, somaValorDiagonalSecundaria = 0;

		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);

		// Cria um Laço de repetição para ler os valores digitados pelo usuário
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nDigite um valor para a posição [ " + linha + " ][ " + coluna + " ]");
				valor[linha][coluna] = leia.nextInt();
			}

		}

		// Imprime na tela os Elementos da Diagonal Principal
		System.out.println("\nElementos da Diagonal Principal:");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.printf("%d ", valor[linha][coluna]);
				}
			}
		}

		System.out.println("\n");
		
		// Imprime na tela os Elementos da Diagonal Secundaria
		System.out.println("\nElementos da Diagonal Secundaria:");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == 3 - 1) {
					System.out.printf("%d ", valor[linha][coluna]);
				}
			}
		}

		System.out.println("\n");

		// Imprime na tela a soma da diagonal principal
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					somaValorDiagonalPrincipal += valor[linha][coluna];
				}

			}
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaValorDiagonalPrincipal);
		
		// Imprime na tela a soma da diagonal secundaria
		System.out.println("\nSoma dos Elementos da Diagonal Secundaria: " + somaValorDiagonalSecundaria);
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha + coluna == 3 - 1) {
					somaValorDiagonalSecundaria += valor[linha][coluna];
				}

			}
		}

	}

}