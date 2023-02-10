package lacos_de_repeticoes;

import java.util.Scanner;

public class laco_repeticoes_for1 {

	public static void main(String[] args) {
		
		// Declarando as váriaveis
		int primeiroIntervalo, segundoIntervalo, intervalo = 0;
		
		// Cria uma instância para ler a entrada do usuário
		Scanner leia = new Scanner (System.in);
		
		// Pede para o usúario inserir um valor para o Primeiro Inicio e o Segundo Inicio
		System.out.println("Insira o primeiro intervalo: ");
		primeiroIntervalo = leia.nextInt();
		System.out.println("\nInsira o segundo intervalo: ");		
		segundoIntervalo = leia.nextInt();
		
		// Laço condicional que determina se o Primeiro Intervalo é maior ou igual ao Segundo Intervalo, caso não for, ele prosseguirá para o for
		if(primeiroIntervalo >= segundoIntervalo) {
			System.out.println("\nIntervalo Inválido!!");
		} else {
			// Laço de repetição que monstrará os múltiplos de 3 e 5 entre o intervalo definido
			for (intervalo = primeiroIntervalo; intervalo <= segundoIntervalo; intervalo++) {
				if (intervalo % 3 == 0 && intervalo % 5 == 0) {
					System.out.printf("\n%d é múltiplo de 3 e 5", intervalo);
				}
			}
		}
	
		
	}

}