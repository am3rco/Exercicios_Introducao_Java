package exercicios_introducao_logica;

import java.util.Scanner;

public class médiafinal5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, mediap;
		String nome;
				
		
		System.out.println("Siga os procedimentos abaixo para descobrir a sua média ponderada");
		
		System.out.println("\nQual o seu nome: ");
		nome = leia.next();
		System.out.println("\nInsira a sua primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nInsira a sua segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nInsira a sua terceira nota: ");
		nota3 = leia.nextDouble();
		
		mediap = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		
		System.out.printf("A sua média ponderada é: %.1f", mediap);
	}

}
