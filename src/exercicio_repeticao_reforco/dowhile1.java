package exercicio_repeticao_reforco;

import java.util.Scanner;

public class dowhile1 {

	public static void main(String[] args) {

		// Cria a instância para ler a entrada do usuario
		Scanner leia = new Scanner (System.in);
		
		// Declara as variaveis
		int numero, somaNumero = 0;
		
		System.out.println("Para sair insira (0)");
		
		// Cria um laço de repetição, que irá repetir pelo menos uma vez
		do {
			
			// Pede ao usuario dar um valor a variavel numero
			System.out.println("\nInsira um número: ");
			numero = leia.nextInt();
			
			// Cria um laço condicional, em que os numeros serão somados até que o 0 seja inserido
			if (numero != 0) {
				somaNumero += numero;
			}
			// Quando o numero foi 0, o laço irá parar
		} while (numero != 0);
		
		// Imprime na tela do usuário a soma dos numeros
		System.out.printf("\nA soma dos numeros foi: %d", somaNumero);
		
	}

}
