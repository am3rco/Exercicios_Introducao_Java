package exercicio_repeticao_reforco;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		
		// Cria uma instância para ler a entrada do usuário
		Scanner leia = new Scanner(System.in);
		
		// Declara as variaveis
		int numero;
		int somaNumero = 0, mediaNumero = 0, quantidadeNumero = 0;
		
		// Cria uma laço de repetição que se repetira pelo menos uma vez
		do {
			
			// Pede ao usuario para dar um valor a variavel numero
			System.out.println("\nDigite um numero: ");
			numero = leia.nextInt();

			//Cria um Laço Condicional, para que se caso o numero for igual ou maior a zero, faça a soma
			if (numero % 3 == 0 & numero != 0) {
				quantidadeNumero++;
				somaNumero += numero;
				mediaNumero = somaNumero / quantidadeNumero;
			}
			
		}while (numero != 0);
		
		// Mostra ao usuario a média dos números múltiplos de 3
		System.out.printf("\nA média dos números múltiplos de 3 é: %d", mediaNumero);
		
	}

}
