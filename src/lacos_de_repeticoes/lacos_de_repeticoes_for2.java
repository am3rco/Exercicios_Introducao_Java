package lacos_de_repeticoes;

import java.util.Scanner;

public class lacos_de_repeticoes_for2 {

	public static void main(String[] args) {
		
		// Declarando as váriaveis
		int contador, numero, totalPar = 0, totalImpar = 0;
		
		
		
		// Cria uma instância para ler a entrada do usuário
		Scanner sc = new Scanner (System.in);
		
		// Esse laço de repetição, pede 10 vezes para que o usuário insira um número
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Insira o " +contador+ "° número: ");
			numero = sc.nextInt();
			
			// Esse laço condicional contabiliza se o numero inserido for par, caso não for, ele contabilizar como impar.
			if (numero % 2 == 0 ) {
				totalPar++;
			} else {
				totalImpar++;
			}
			
		}
		
		System.out.printf("\nTotal de números pares: %d ", totalPar);
		System.out.printf("\nTotal de números impares: %d", totalImpar);
		

	}

}
