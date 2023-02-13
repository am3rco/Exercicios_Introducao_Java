package exercicio_repeticao_reforco;

import java.util.Scanner;

public class for2 {

	public static void main(String[] args) {
		
		//Cria uma instância para ler a entrada do usuario 
		Scanner leia = new Scanner (System.in);
		
		//Declarando as váriaveis 
		int contador, numero, numeroPar = 0, numeroImpar = 0;
		
		//Cria um laço de repetição pedindo ao usuario para inserir um numero dez vezes
		for(contador = 1; contador <= 10; contador++) {
			
			//Pede ao usuario para entrar com um valor para o numero
			System.out.println("\nInsira o "+contador+"° numero: ");
			numero = leia.nextInt();
			
			//Cria uma laço de repetição para contabilizar quantos numeros são pares e impares
			if (numero % 2 == 0) {
				numeroPar++;
			} 
			else if (numero % 2 == 1){
				numeroImpar++;
			}
		}
		
		System.out.printf("\nTem %d números pares", numeroPar);
		System.out.printf("\nTem %d números impares", numeroImpar);

	}

}
