package exercicios1;

import java.util.Scanner;

public class atividadeDiferençadosProdutos {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4, calculo;
		
		
		System.out.println("\nInsira o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		n3 = leia.nextInt();
		System.out.println("\nInsira o quarto número: ");
		n4 = leia.nextInt();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.printf("Este é a diferença: %d",calculo);
		
	}

}
