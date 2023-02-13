package exercicio_repeticao_reforco;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {

		// Cria uma instância para ler a entrada do usuário
		Scanner leia = new Scanner(System.in);

		// Declando as váriaveis
		int idade, genero, opcaoCaracteristica, contador = 0, totalPessoasCalmas = 0, totalMulherNervosa = 0, totalHomemAgressivo = 0,
				totalOutrosCalmos = 0, totalPessoaNervosaMais40 = 0, totalPessoaCalmaMenos18 = 0;

		// Laço que ira repetir um questionário de caracteristicas pessoais
		while (contador != 150) {

			// Entra com um valor para a idade
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			// Entra com um valor para a sua Identificação de Gênero
			System.out.println("\nGênero: ");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino ");
			System.out.println("3 - Outros");
			genero = leia.nextInt();

			// Entre com um valor para a sua caracteristicas
			System.out.println("\nCaracterísticas: ");
			System.out.println("1 – Se a pessoa era calma");
			System.out.println("2 – Se a pessoa era nervosa");
			System.out.println("3 – Se a pessoa era agressiva");
			opcaoCaracteristica = leia.nextInt();
			
			switch (opcaoCaracteristica) {
			case 1:
				totalPessoasCalmas++;
				if (genero == 3) {
					totalOutrosCalmos++;
				}
				if (idade < 18) {
					totalOutrosCalmos++;
				}
				break;
			case 2:
				if (genero == 1) {
					totalMulherNervosa++;
				}
				if (idade > 40) {
					totalPessoaNervosaMais40++;
				}
				break;
			case 3:
				if (genero == 2) {
					totalHomemAgressivo++;
				}
				
				
			}
			contador++;
		}

		// Mostra na tela do usuario as estatisticas
		System.out.printf("\nTotal de pessoas calmas: %d", totalPessoasCalmas);
		System.out.printf("\nTotal de mulheres nervosas: %d", totalMulherNervosa);
		System.out.printf("\nTotal de homens agressivos: %d", totalHomemAgressivo);
		System.out.printf("\nTotal de outros calmos: %d", totalOutrosCalmos);
		System.out.printf("\nTotal de outros calmos: %d", totalPessoaNervosaMais40);
		System.out.printf("\nTotal de outros calmos: %d", totalPessoaCalmaMenos18);

	}

}
