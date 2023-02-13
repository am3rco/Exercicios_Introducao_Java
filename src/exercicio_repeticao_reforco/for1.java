package exercicio_repeticao_reforco;

import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		
		//Cria uma intância para ler a entrada do usuario
		Scanner leia = new Scanner (System.in);
		
		//Declando as variaveis
		int numero; 
		
		//Cria um laço de repeticão que vai de 1000 até 1999
		for (numero = 1000; numero <= 1999; numero++) {
			
			//Cria um laço de repetição para mostrar os numeros que tem resto 5 quando divido por 11
			if (numero % 11 == 5) {
				
				//Imprime o resutlrado na tela
				System.out.printf("\nO número %d tem como resto 5 quando dividido por 5", numero);
				
			}
			
		}

	}

}
