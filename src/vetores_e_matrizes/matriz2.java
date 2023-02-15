package vetores_e_matrizes;

import java.util.Scanner;

public class matriz2 {

	public static void main(String[] args) {

		// Cria uma instância para ler a entrada do usuario
		Scanner leia = new Scanner(System.in);

		// Cria um array com 10 linhas e 4 colunas
		float[][] notas = new float[10][4];

		// Cria dois array, um para fazer a soma das linhas e outro para fazer a media da soma
		// Isso evita ter que criar diversas variaveis para soma e nota
		float[] somas = new float[10];
		float[] medias = new float[10];
			
		// Declara as variaveis
		int linha, coluna, indice;

		// Laço de Repetição para inserir um valor para cada coluna e linha
		for (linha = 0; linha < notas.length; linha++) {
			for (coluna = 0; coluna < notas[0].length; coluna++) {
				System.out.println("\nDigite um valor para a posição [ " + linha + " ][ " + coluna + " ]");
				notas[linha][coluna] = leia.nextFloat();
				
				// Define o valor de cada elemento de somas, adicionando o valor de cada posição de notas
				somas[linha] += notas [linha][coluna];
			}
			
			// Faz a médias da soma das linhas
			medias[linha] = somas[linha] / notas[coluna].length;
			
		}

		// Imprime a média de cada linha
		for (indice = 0; indice < medias.length; indice++) {
			System.out.printf("[%.1f]", medias[indice]);
		}
		
	}

}
