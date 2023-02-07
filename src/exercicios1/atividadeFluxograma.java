package exercicios1;

import java.util.Scanner;

public class atividadeFluxograma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salario, abono, novosalario;
		
		System.out.println("Digite o seu Sálario: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o seu Abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.printf("\nEste é o seu novo sálario: %.2f",novosalario);
		
	}

}
