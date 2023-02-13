package exercicio_repeticao_reforco;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		
		//Cria uma instância para ler a entrada do usuário
		Scanner leia = new Scanner (System.in);
		
		//Declarando as váriaveis 
		int idade = 0, totalMenor = 0, totalMaior = 0;
		
		// Laço que vai repetir até que o número seja -99
		while (idade !=-99) {
			
			//Entra com um valor para a idade
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			//Distribui entre aqueles que possuem menos de 21 anos e mais de 50 anos
			if (idade < 21 && idade >=0) {
				totalMenor++;
			} else if (idade > 50) {
				totalMaior++;
			}
			
			
		}
		
		// Mostra quantas pessoas tem menos de 21 anos e quantas tem mais de 50 anos
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", totalMenor);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", totalMaior);
		
	}

}
