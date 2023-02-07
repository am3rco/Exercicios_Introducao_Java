package exercicios1;

import java.util.Scanner;

public class atividadeNota {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;

		System.out.println("Insira a sua primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nInsira a sua segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nInsira a sua terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.println("\nInsira a sua quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1+nota2+nota3+nota4) / 4 ;
		
		System.out.printf("\nA média de suas notas é: %.1f",media);
		
	}

}
